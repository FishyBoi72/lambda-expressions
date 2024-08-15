package org.example;

public class Lambda {

    // Define an interface named Operation with a method signature for execute
    interface Operation {
        double execute(double a, double b); // Method that takes two doubles and returns a double
    }

    public static void main(String[] args) {

        // Create a lambda expression for addition and assign it to the Operation interface
        Operation addition = (a, b) -> a + b;

        // Create a lambda expression for subtraction and assign it to the Operation interface
        Operation subtraction = (a, b) -> a - b;

        // Create a lambda expression for multiplication and assign it to the Operation interface
        Operation multiplication = (a, b) -> a * b;

        // Create a lambda expression for division and assign it to the Operation interface
        Operation division = (a, b) -> a / b;

        // Initialize two double variables, num1 and num2
        double num1 = 10.0, num2 = 5.0;

        // Print the result of the addition operation using the execute method of the addition lambda
        System.out.println("Addition: " + addition.execute(num1, num2));

        // Print the result of the subtraction operation using the execute method of the subtraction lambda
        System.out.println("Subtraction: " + subtraction.execute(num1, num2));

        // Print the result of the multiplication operation using the execute method of the multiplication lambda
        System.out.println("Multiplication: " + multiplication.execute(num1, num2));

        // Print the result of the division operation using the execute method of the division lambda
        System.out.println("Division: " + division.execute(num1, num2));
    }
}
