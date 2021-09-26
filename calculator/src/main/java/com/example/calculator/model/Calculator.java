package com.example.calculator.model;

import java.lang.Math;

public class Calculator {
    public double calculate(double firstNumber, double secondNumber, String action) {
        double firstNumberCopy = firstNumber;
        if (action == "+")
            return firstNumber + secondNumber;

        if (action == "-")
            return firstNumber - secondNumber;

        if (action == "*")
            if (firstNumber == 0 || secondNumber == 0)
                return 0;
            else
                return firstNumber * secondNumber;

        if (action == "/")
            if (secondNumber == 0)
                throw new IllegalArgumentException("Divide by zero error");
            else
                return firstNumber / secondNumber;

        if (action == "**") {
            if (secondNumber == 0)
                return 1;
            if (secondNumber > 0) {
                for (double i = 0; i < secondNumber; i++)
                    firstNumber = firstNumber * firstNumberCopy;
                return firstNumber;
            }

            if (secondNumber < 0) {
                for (double i = 0; i < secondNumber; i++)
                    firstNumber = firstNumber * firstNumberCopy;
                return firstNumber;
            }
        }

        if(action=="sqrt"){
            return Math.sqrt(firstNumber);
        }

        throw new UnsupportedOperationException();

    }
}