import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Q5_c_RegistrationForm {
    public static void main(String[] args) {
        System.out.println("Starting Practical 7 - Question 5.c: AWT Registration Form (design only)...");

        Frame frame = new Frame("Registration Form");
        frame.setSize(520, 580);
        frame.setLayout(new GridBagLayout());
        Color bgColor = new Color(50, 56, 68);
        frame.setBackground(bgColor);

        Font titleFont = new Font("SansSerif", Font.BOLD, 20);
        Font labelFont = new Font("SansSerif", Font.BOLD, 14);
        Font inputFont = new Font("SansSerif", Font.PLAIN, 13);
        Font buttonFont = new Font("SansSerif", Font.BOLD, 13);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 12, 6, 12);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        Label titleLabel = new Label("Registration Form");
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.YELLOW);
        titleLabel.setBackground(bgColor);
        frame.add(titleLabel, gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        Label nameLbl = new Label("Name");
        nameLbl.setFont(labelFont);
        nameLbl.setForeground(Color.WHITE);
        nameLbl.setBackground(bgColor);
        frame.add(nameLbl, gbc);

        gbc.gridx = 1;
        TextField nameField = new TextField("Ram", 25);
        nameField.setFont(inputFont);
        frame.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        Label fatherNameLbl = new Label("Father Name");
        fatherNameLbl.setFont(labelFont);
        fatherNameLbl.setForeground(Color.WHITE);
        fatherNameLbl.setBackground(bgColor);
        frame.add(fatherNameLbl, gbc);

        gbc.gridx = 1;
        TextField fatherNameField = new TextField("Kumar", 25);
        fatherNameField.setFont(inputFont);
        frame.add(fatherNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        Label ageLbl = new Label("Age");
        ageLbl.setFont(labelFont);
        ageLbl.setForeground(Color.WHITE);
        ageLbl.setBackground(bgColor);
        frame.add(ageLbl, gbc);

        gbc.gridx = 1;
        TextField ageField = new TextField("23", 25);
        ageField.setFont(inputFont);
        frame.add(ageField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        Label genderLbl = new Label("Gender");
        genderLbl.setFont(labelFont);
        genderLbl.setForeground(Color.WHITE);
        genderLbl.setBackground(bgColor);
        frame.add(genderLbl, gbc);

        gbc.gridx = 1;
        Panel genderPanel = new Panel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        genderPanel.setBackground(bgColor);
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox maleRadio = new Checkbox("Male", genderGroup, true);
        Checkbox femaleRadio = new Checkbox("Female", genderGroup, false);
        maleRadio.setFont(inputFont);
        maleRadio.setForeground(Color.WHITE);
        maleRadio.setBackground(bgColor);
        femaleRadio.setFont(inputFont);
        femaleRadio.setForeground(Color.WHITE);
        femaleRadio.setBackground(bgColor);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        frame.add(genderPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        Label courseLbl = new Label("Course");
        courseLbl.setFont(labelFont);
        courseLbl.setForeground(Color.WHITE);
        courseLbl.setBackground(bgColor);
        frame.add(courseLbl, gbc);

        gbc.gridx = 1;
        Choice courseChoice = new Choice();
        courseChoice.setFont(inputFont);
        courseChoice.add("Java");
        courseChoice.add("Python");
        courseChoice.add("C++");
        courseChoice.add("Web Development");
        courseChoice.add("Data Science");
        courseChoice.select("Java");
        frame.add(courseChoice, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        Label hobbiesLbl = new Label("Hobbies");
        hobbiesLbl.setFont(labelFont);
        hobbiesLbl.setForeground(Color.WHITE);
        hobbiesLbl.setBackground(bgColor);
        frame.add(hobbiesLbl, gbc);

        gbc.gridx = 1;
        Panel hobbiesPanel = new Panel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        hobbiesPanel.setBackground(bgColor);
        Checkbox cbDrawing = new Checkbox("Drawing", true);
        Checkbox cbSinging = new Checkbox("Singing", false);
        Checkbox cbMusic = new Checkbox("Music", false);
        Checkbox cbOthers = new Checkbox("Others", false);
        cbDrawing.setFont(inputFont);
        cbDrawing.setForeground(Color.WHITE);
        cbDrawing.setBackground(bgColor);
        cbSinging.setFont(inputFont);
        cbSinging.setForeground(Color.WHITE);
        cbSinging.setBackground(bgColor);
        cbMusic.setFont(inputFont);
        cbMusic.setForeground(Color.WHITE);
        cbMusic.setBackground(bgColor);
        cbOthers.setFont(inputFont);
        cbOthers.setForeground(Color.WHITE);
        cbOthers.setBackground(bgColor);
        hobbiesPanel.add(cbDrawing);
        hobbiesPanel.add(cbSinging);
        hobbiesPanel.add(cbMusic);
        hobbiesPanel.add(cbOthers);
        frame.add(hobbiesPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        Label addressLbl = new Label("Address");
        addressLbl.setFont(labelFont);
        addressLbl.setForeground(Color.WHITE);
        addressLbl.setBackground(bgColor);
        frame.add(addressLbl, gbc);

        gbc.gridx = 1;
        TextArea addressArea = new TextArea("234 - 1d First Street,\nAnna Main Road\nNamakkal", 4, 25, TextArea.SCROLLBARS_VERTICAL_ONLY);
        addressArea.setFont(inputFont);
        frame.add(addressArea, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(16, 12, 12, 12);

        Panel btnPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        btnPanel.setBackground(bgColor);

        Button saveBtn = new Button("Save Details");
        saveBtn.setFont(buttonFont);
        saveBtn.setBackground(new Color(0, 50, 230));
        saveBtn.setForeground(Color.WHITE);
        btnPanel.add(saveBtn);

        Button clearBtn = new Button("Clear All");
        clearBtn.setFont(buttonFont);
        clearBtn.setBackground(new Color(220, 20, 20));
        clearBtn.setForeground(Color.WHITE);
        btnPanel.add(clearBtn);

        frame.add(btnPanel, gbc);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}