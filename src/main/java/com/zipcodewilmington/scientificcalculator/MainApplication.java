package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("Select an option");
        int option=Console.getIntegerInput("Enter an integer");
        //String s = Console.getStringInput("Enter a string");
        String selected;
        switch (option)
        {
            case 0:selected="Addition of integers";
                break;
            case 1:selected="Substration of integers";
                break;
            case 2:selected="Multiplication of integers";
                break;
            case 3:selected="Division of integers";
                break;

        }
        if(option==0) {
            int i = Console.getIntegerInput("Enter an integer");
            int i2 = Console.getIntegerInput("Enter an integer");
            //Double d = Console.getDoubleInput("Enter a double.");
            int result = Console.addInt(i, i2);
            //Console.println("The user input %s as a string", s);
            Console.println("The result is " + result);
        }
        ;

        //Console.println("The user input %s as a d", d);
    }
}
