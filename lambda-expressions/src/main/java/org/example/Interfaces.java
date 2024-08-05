package org.example;

public class Interfaces {
    @FunctionalInterface
    interface StringConcat {
        String concat(String a, String b);
    }

    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        StringConcat concat = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println("Concatenation: " + concat.concat("Hello, ", "world!"));
        System.out.println("Multiplication: " + multiply.operation(6, 7));
    }
}
