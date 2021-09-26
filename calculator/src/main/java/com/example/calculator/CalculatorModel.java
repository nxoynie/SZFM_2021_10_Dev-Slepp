package com.example.calculator;
package calc;

import java.lang.Math;

public class CalculatorModel {

    public CalculatorModel(){};


    ////// ADDITION //////////////////

    public int addition(int a, int b){
        return a+b;
    }

    public double addition(double a, double b){
        return a+b;
    }

    public double addition(int a, double b){
        return a+b;
    }

    public double addition(double a, int b){
        return a+b;
    }

    //////// SUBTRACTION  ////////////

    public int subtraction(int a, int b){
        return a-b;
    }

    public double subtraction(double a, double b){
        return a-b;
    }

    public double subtraction(int a, double b){
        return a-b;
    }

    public double subtraction(double a, int b){
        return a-b;
    }

    //////// MULTIPLICATION  ////////////

    public int multiplication(int a, int b){
        return a*b;
    }

    public double multiplication(double a, double b){
        return a*b;
    }

    public double multiplication(int a, double b){
        return a*b;
    }

    public double multiplication(double a, int b){
        return a*b;
    }

    //////// DIVISION  ////////////

    public int division(int a, int b){
        return a/b;
    }

    public double division(double a, double b){
        return a/b;
    }

    public double division(int a, double b){
        return a/b;
    }

    public double division(double a, int b){
        return a/b;
    }

    //////// EXPONENTATION  ////////////

    public double exponentation(int a, int b){
        return  Math.pow(a, b);
    }

    public double exponentation(double a, double b){
        return  Math.pow(a, b);
    }

    public double exponentation(double a, int b){
        return  Math.pow(a, b);
    }

    public double exponentation(int a, double b){
        return  Math.pow(a, b);
    }

    //////// ROOT  ////////////

    // second parameter is the root number
    public double root(int a, int b){
        return  Math.pow(a, 1/b);
    }

    public double root(double a, double b){
        return  Math.pow(a, 1/b);
    }


}
