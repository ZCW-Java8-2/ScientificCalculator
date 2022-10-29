package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Square");
        System.out.println("6.Square Root");
        System.out.println("7.Exponents");
        System.out.println("8.Inverse");
        System.out.println("9.Sine");
        System.out.println("10.Cosine");
        System.out.println("11.Tangent");
        System.out.println("12.Factorial");
        int option=Console.getIntegerInput("Enter an option");

try {
    Double n1 = Console.getDoubleInput("Enter an integer");
    String selected;
    Double n2;
    switch (option) {

        case 1:
            n2 = Console.getDoubleInput("Enter an integer");
            System.out.println(Console.add(n1, n2));
            break;
        case 2:
            n2 = Console.getDoubleInput(selected = "Subtraction of integers");
            System.out.println(Console.subtraction(n1, n2));
            break;
        case 3:
            n2 = Console.getDoubleInput("Multiplication of integers");
            System.out.println(Console.multiplication(n1, n2));
            break;
        case 4:
            n2 = Console.getDoubleInput("Division of integers");
            System.out.println(Console.division(n1, n2));
            break;
        case 5:
            System.out.println(Console.square(n1));
            break;
        case 6:
            System.out.println(Console.squareRoot(n1));
            break;
        case 7:
            n2 = Console.getDoubleInput("Exponents of integers");
            System.out.println(Console.exponents(n1, n2));
            break;
        case 8:
            System.out.println(Console.inverse(n1));
            break;
        case 9:
            System.out.println(Console.sin(n1));
            break;
        case 10:
            System.out.println(Console.cos(n1));
            break;
        case 11:
            System.out.println(Console.tan(n1));
            break;
        case 12:
            System.out.println(Console.factorial(n1));
            break;
        default:
            System.out.println("Select option again");
    }
} catch (Exception e) {
    Console.println("Err");
}
    }
}
