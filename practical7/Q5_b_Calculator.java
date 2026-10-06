import java.awt.Button;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Q5_b_Calculator {
    public static void main(String[] args) {
        System.out.println("Starting Practical 7 - Question 5.b: AWT Calculator (design only)...");

        Frame frame = new Frame("Calculator");
        frame.setSize(320, 440);
        frame.setLayout(null);
        frame.setBackground(new Color(68, 73, 80));
        frame.setResizable(false);

        TextField display = new TextField("0");
        display.setBounds(20, 45, 280, 55);
        display.setEditable(false);
        display.setBackground(new Color(220, 226, 230));
        display.setForeground(new Color(25, 25, 25));
        display.setFont(new Font("Monospaced", Font.BOLD, 28));
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        frame.add(display);

        Panel buttonPanel = new Panel();
        buttonPanel.setBounds(20, 115, 280, 290);
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
        buttonPanel.setBackground(new Color(68, 73, 80));

        String[] buttons = {
            "7", "8", "9", "÷",
            "4", "5", "6", "x",
            "1", "2", "3", "-",
            "0", ".", "+", "="
        };

        for (String text : buttons) {
            Button btn = new Button(text);
            btn.setFont(new Font("SansSerif", Font.BOLD, 22));

            if (text.equals("=")) {
                btn.setBackground(new Color(245, 142, 44));
                btn.setForeground(Color.WHITE);
            } else {
                btn.setBackground(Color.WHITE);
                btn.setForeground(new Color(35, 35, 35));
            }

            buttonPanel.add(btn);
        }

        frame.add(buttonPanel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}