package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        
        // Creates a Predicate that checks if a number is positive
        Predicate<Integer> isPositive = number -> number > 0;
        
        // Tests the Predicate with the value 5 and prints the result
        System.out.println("Is 5 positive? " + isPositive.test(5));
        
        // Tests the Predicate with the value -3 and prints the result
        System.out.println("Is -3 positive? " + isPositive.test(-3));

        // Creates a Function that takes a String and returns its length
        Function<String, Integer> stringLength = str -> str.length();
        
        // Applies the Function to the string "Hello" and prints the length
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        // Creates a Consumer that prints a given message
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        
        // Accepts the string "This is a lambda expression!" and prints it
        printMessage.accept("This is a lambda expression!");

        // Creates a Supplier that provides a default string
        Supplier<String> defaultString = () -> "Default String";
        
        // Gets the value from the Supplier and prints it
        System.out.println("Supplier: " + defaultString.get());
    }
}
