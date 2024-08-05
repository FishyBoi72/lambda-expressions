package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = number -> number > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5));
        System.out.println("Is -3 positive? " + isPositive.test(-3));

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("This is a lambda expression!");

        Supplier<String> defaultString = () -> "Default String";
        System.out.println("Supplier: " + defaultString.get());
    }
}