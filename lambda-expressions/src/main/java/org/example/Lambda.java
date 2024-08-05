package org.example;

public class Lambda {
    interface Operation {
        double execute(double a, double b);
    }

    public static void main(String[] args) {

        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;

        double num1 = 10.0, num2 = 5.0;

        System.out.println("Addition: " + addition.execute(num1, num2));
        System.out.println("Subtraction: " + subtraction.execute(num1, num2));
        System.out.println("Multiplication: " + multiplication.execute(num1, num2));
        System.out.println("Division: " + division.execute(num1, num2));
    }
}
