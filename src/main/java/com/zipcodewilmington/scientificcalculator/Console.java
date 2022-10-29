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

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }

    public static int addInt(int i, int j) {

        return i + j;
    }

    public static int subtractionInt(int i, int j) {

        return i - j;


    }
    public static int multiplicationInt(int i, int j) {

        return i * j;
    }

    public static int divisionInt(int i, int j) {

        return i / j;
    }
    public static int squareInt(int i) {

        return i * i;
    }
    public static double squareRootInt(int i) {

        return Math.sqrt(i);
    }
    public static double exponentsInt(int i, int j) {

        return Math.pow(i,j);
    }
    public static int inverseInt(int i) {

        return (1 / i);
    }


}