import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Q5_AWTForm {
    public static void main(String[] args) {
        Frame frame = new Frame("Login Form");
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        frame.add(new Label("--- Login Form ---"), gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        frame.add(new Label("Gmail ID:"), gbc);

        TextField gmailField = new TextField(20);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        frame.add(gmailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        frame.add(new Label("Password:"), gbc);

        TextField passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        frame.add(passwordField, gbc);

        Panel buttonPanel = new Panel();
        buttonPanel.add(new Button("Login"));
        buttonPanel.add(new Button("Reset"));

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        frame.add(buttonPanel, gbc);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}