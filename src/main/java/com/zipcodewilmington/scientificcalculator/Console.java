package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static int getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int  userInput = scanner.nextInt();
        return userInput;
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double  userInput = scanner.nextDouble();
        return userInput;

    }

    public static double add(double i, double j) {

        return i + j;
    }

    public static double subtraction(double i, double j) {

        return i - j;


    }
    public static double multiplication(double i, double j) {

        return i * j;
    }

    public static double division(double i, double j) {

        return i / j;
    }
    public static double square(double i) {

        return i * i;
    }
    public static double squareRoot(double i) {

        return Math.sqrt(i);
    }
    public static double exponents(double i, double j) {

        return Math.pow(i,j);
    }
    public static double inverse(double i) {

        return (1 / i);
    }


}