import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Q4_GUIClient extends Frame implements ActionListener {
    TextArea chat = new TextArea();
    TextField msg = new TextField();
    Button send = new Button("Send");
    DatagramSocket ds;

    Q4_GUIClient() throws Exception {
        ds = new DatagramSocket(5002);

        setTitle("Client");
        setLayout(new BorderLayout());
        add(chat, BorderLayout.CENTER);
        Panel bottom = new Panel(new BorderLayout());
        bottom.add(msg, BorderLayout.CENTER);
        bottom.add(send, BorderLayout.EAST);
        add(bottom, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);

        send.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String text = msg.getText();
            byte[] data = text.getBytes();
            DatagramPacket p = new DatagramPacket(data, data.length,
                    InetAddress.getByName("localhost"), 5001);
            ds.send(p);
            chat.append("Me: " + text + "\n");
            msg.setText("");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws Exception {
        Q4_GUIClient f = new Q4_GUIClient();

        while (true) {
            byte[] buffer = new byte[1024];
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
            f.ds.receive(p);
            String text = new String(p.getData(), 0, p.getLength());
            f.chat.append("Server: " + text + "\n");
        }
    }
}
