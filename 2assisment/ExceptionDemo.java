package com.cs_is.assignment2;

import java.io.FileReader;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("abc.txt");
        } catch (Exception e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }
}