package com.aws.admin;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        // Optional: handle divide-by-zero if needed
        return a / b;
    }
}
