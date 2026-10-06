import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q5_AWTForm_Events implements ActionListener {
    private final TextField gmailField;
    private final TextField passwordField;

    private static final String VALID_GMAIL = "admin@gmail.com";
    private static final String VALID_PASSWORD = "admin123";

    public Q5_AWTForm_Events(TextField gmailField, TextField passwordField) {
        this.gmailField = gmailField;
        this.passwordField = passwordField;
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (command.equals("Login")) {
            handleLogin(event);
        } else if (command.equals("Reset")) {
            handleReset(event);
        }
    }

    private void handleLogin(ActionEvent event) {
        String gmail = gmailField.getText().trim();
        String password = passwordField.getText();

        if (gmail.equals(VALID_GMAIL) && password.equals(VALID_PASSWORD)) {
            System.out.println("Login successful. Welcome " + gmail + "!");
        } else {
            System.out.println("Login failed. Invalid Gmail ID or Password.");
        }
    }

    private void handleReset(ActionEvent event) {
        gmailField.setText("");
        passwordField.setText("");
        gmailField.requestFocus();
        System.out.println("Login form reset. Fields cleared.");
    }
}