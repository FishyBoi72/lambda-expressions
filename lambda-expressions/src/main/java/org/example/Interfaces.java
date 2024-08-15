package org.example;

public class Interfaces {

    // Define a public class named Interfaces.

    @FunctionalInterface
    // Annotation indicating that the following interface is a functional interface,
    // meaning it has exactly one abstract method and can be used as the assignment target for a lambda expression or method reference.

    interface StringConcat {
        String concat(String a, String b);
        // A functional interface with a single abstract method named 'concat' that takes two strings as parameters and returns a concatenated string.
    }

    @FunctionalInterface
    // Annotation indicating that the following interface is also a functional interface.

    interface MathOperation {
        int operation(int a, int b);
        // A functional interface with a single abstract method named 'operation' that takes two integers as parameters and returns an integer result.
    }

    public static void main(String[] args) {
        // The main method, which serves as the entry point for the Java application.

        StringConcat concat = (a, b) -> a + b;
        // Creates an instance of the StringConcat interface using a lambda expression. 
        // The lambda takes two string parameters 'a' and 'b' and returns their concatenation.

        MathOperation multiply = (a, b) -> a * b;
        // Creates an instance of the MathOperation interface using a lambda expression.
        // The lambda takes two integer parameters 'a' and 'b' and returns their product.

        System.out.println("Concatenation: " + concat.concat("Hello, ", "world!"));
        // Prints the result of the concat method, which concatenates the strings "Hello, " and "world!" and outputs "Concatenation: Hello, world!".

        System.out.println("Multiplication: " + multiply.operation(6, 7));
        // Prints the result of the operation method, which multiplies the integers 6 and 7 and outputs "Multiplication: 42".
    }
}
