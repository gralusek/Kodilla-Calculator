package com.kodilla;

public class Calculator {

    int a;
    int b;

    public int adding(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }
}

class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addingResult = calculator.adding(5,6);
        int substractresult = calculator.substract(6,3);

        System.out.println("Adding result: " + addingResult);
        System.out.println("Substract Result: " + substractresult);
    }
}
