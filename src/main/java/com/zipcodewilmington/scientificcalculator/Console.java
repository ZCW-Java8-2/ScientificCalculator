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
        int userInput = scanner.nextInt();
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
        double userInput = scanner.nextDouble();
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

        return Math.pow(i, j);
    }

    public static double inverse(double i) {
        String sNumber = (String) String.format("%.2f", (1 / i));
        Double newNumber = Double.parseDouble(sNumber);
        return (newNumber);
    }

    public static double sin(double i) {
        String sNumber1 = (String) String.format("%.2f", (Math.sin(i)));
        Double newSin = Double.parseDouble(sNumber1);
        return (newSin);
    }

    public static double cos(double i) {
        String sNumber2 = (String) String.format("%.2f", (Math.cos(i)));
        Double newCos = Double.parseDouble(sNumber2);
        return (newCos);
    }

    public static double tan(double i) {
        String sNumber3 = (String) String.format("%.2f", (Math.tan(i)));
        Double newTan = Double.parseDouble(sNumber3);
        return (newTan);
    }
}