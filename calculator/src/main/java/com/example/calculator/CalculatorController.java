package com.example.calculator;

import com.example.calculator.CalculatorModel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;

    private CalculatorModel calculator;
    private boolean startNumber = true;
    private double number1;
    private String operator = "";

    @FXML
    private void initialize() {
        calculator = new CalculatorModel();
    }

    @FXML
    private void processDigit(ActionEvent event) {
        String digitPressed = ((Button) event.getSource()).getText();
        System.out.println(digitPressed);
        if (startNumber || display.getText().equals("0")) {
            display.setText(digitPressed);
        } else {
            display.setText(display.getText() + digitPressed);
        }
        startNumber = false;
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String operatorPressed = ((Button) event.getSource()).getText();
        System.out.println(operatorPressed);
        if (operatorPressed.equals("=")) {
            if (operator.isEmpty()) {
                return;
            }
            double number2 = Double.parseDouble(display.getText());
            System.out.println(operator);
            double result = 0;
            switch (operator) {
                case "+": { result = calculator.addition(number1, number2);  display.setText(String.valueOf(result)); break; }
                case "-": { result = calculator.subtraction(number1, number2); display.setText(String.valueOf(result)); break; }
                case "*": { result = calculator.multiplication(number1, number2);  display.setText(String.valueOf(result)); break; }
                case "/": { if(number2!=0) {result = calculator.division(number1, number2); display.setText(String.valueOf(result));} else  display.setText("error"); break; }
                case "√": { result = calculator.root((float) number1, (float) number2);  display.setText(String.valueOf(result)); break; }
                case "xʸ": { result = calculator.exponentation((float) number1, (float) number2);  display.setText(String.valueOf(result)); break; }
            }
            System.out.println(result);
            operator = "";
            startNumber = true;
        }else if(operatorPressed.equals("C"))
        {
            number1=0;
            display.setText("0");
            operator= "";
            return;

        } else {
            if (!operator.isEmpty()) {
                return;
            }
            number1 = Double.parseDouble(display.getText());
            operator = operatorPressed;
            startNumber = true;
        }
    }

}

