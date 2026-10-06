import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q5_c_RegistrationForm_Events implements ActionListener {
    private final TextField nameField;
    private final TextField fatherNameField;
    private final TextField ageField;
    private final Checkbox maleRadio;
    private final Checkbox femaleRadio;
    private final Choice courseChoice;
    private final Checkbox cbDrawing;
    private final Checkbox cbSinging;
    private final Checkbox cbMusic;
    private final Checkbox cbOthers;
    private final TextArea addressArea;

    public Q5_c_RegistrationForm_Events(TextField nameField, TextField fatherNameField, TextField ageField,
                                        Checkbox maleRadio, Checkbox femaleRadio, Choice courseChoice,
                                        Checkbox cbDrawing, Checkbox cbSinging, Checkbox cbMusic, Checkbox cbOthers,
                                        TextArea addressArea) {
        this.nameField = nameField;
        this.fatherNameField = fatherNameField;
        this.ageField = ageField;
        this.maleRadio = maleRadio;
        this.femaleRadio = femaleRadio;
        this.courseChoice = courseChoice;
        this.cbDrawing = cbDrawing;
        this.cbSinging = cbSinging;
        this.cbMusic = cbMusic;
        this.cbOthers = cbOthers;
        this.addressArea = addressArea;
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (command.equals("Save Details")) {
            saveDetails(event);
        } else if (command.equals("Clear All")) {
            clearAll(event);
        }
    }

    private void saveDetails(ActionEvent event) {
        String name = nameField.getText();
        String fatherName = fatherNameField.getText();
        String age = ageField.getText();

        String gender = maleRadio.getState() ? "Male" : "Female";

        String course = courseChoice.getSelectedItem();

        String hobbies = collectHobbies();

        String address = addressArea.getText().replace("\n", " ");

        System.out.println("---------- SAVED REGISTRATION DETAILS ----------");
        System.out.println("Name        : " + name);
        System.out.println("Father Name : " + fatherName);
        System.out.println("Age         : " + age);
        System.out.println("Gender      : " + gender);
        System.out.println("Course      : " + course);
        System.out.println("Hobbies     : " + hobbies);
        System.out.println("Address     : " + address);
        System.out.println("-----------------------------------------------");
    }

    private void clearAll(ActionEvent event) {
        nameField.setText("");
        fatherNameField.setText("");
        ageField.setText("");

        maleRadio.setState(true);
        femaleRadio.setState(false);

        courseChoice.select(0);

        cbDrawing.setState(true);
        cbSinging.setState(false);
        cbMusic.setState(false);
        cbOthers.setState(false);

        addressArea.setText("");

        nameField.requestFocus();
        System.out.println("Registration form cleared.");
    }

    private String collectHobbies() {
        StringBuilder hobbies = new StringBuilder();
        if (cbDrawing.getState()) {
            hobbies.append("Drawing, ");
        }
        if (cbSinging.getState()) {
            hobbies.append("Singing, ");
        }
        if (cbMusic.getState()) {
            hobbies.append("Music, ");
        }
        if (cbOthers.getState()) {
            hobbies.append("Others, ");
        }

        if (hobbies.length() == 0) {
            return "None";
        }
        return hobbies.substring(0, hobbies.length() - 2);
    }
}