import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q5_b_Calculator_Events implements ActionListener {
    private final TextField display;
    private double firstOperand = 0;
    private String pendingOperator = "";
    private boolean startNewEntry = true;

    public Q5_b_Calculator_Events(TextField display) {
        this.display = display;
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (isDigitOrDecimal(command)) {
            handleDigit(command);
        }
        else if (command.equals("=")) {
            calculateResult();
        }
        else {
            handleOperator(command);
        }
    }

    private void handleDigit(String digit) {
        if (startNewEntry) {
            display.setText(digit);
            startNewEntry = false;
        }
        else if (!(digit.equals(".") && display.getText().contains("."))) {
            display.setText(display.getText() + digit);
        }
    }

    private void handleOperator(String operator) {
        if (!startNewEntry) {
            calculateResult();
        }
        firstOperand = Double.parseDouble(display.getText());
        pendingOperator = operator;
        startNewEntry = true;
    }

    private void calculateResult() {
        if (pendingOperator.isEmpty()) {
            return;
        }

        double secondOperand = Double.parseDouble(display.getText());
        double result = 0;

        switch (pendingOperator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "x":
                result = firstOperand * secondOperand;
                break;
            case "÷":
                if (secondOperand == 0) {
                    display.setText("Error");
                    pendingOperator = "";
                    startNewEntry = true;
                    return;
                }
                result = firstOperand / secondOperand;
                break;
            default:
                return;
        }

        if (result == Math.floor(result) && !Double.isInfinite(result)) {
            display.setText(String.valueOf((long) result));
        } else {
            display.setText(String.valueOf(result));
        }

        pendingOperator = "";
        startNewEntry = true;
    }

    private boolean isDigitOrDecimal(String command) {
        return command.length() == 1 && (Character.isDigit(command.charAt(0)) || command.equals("."));
    }
}