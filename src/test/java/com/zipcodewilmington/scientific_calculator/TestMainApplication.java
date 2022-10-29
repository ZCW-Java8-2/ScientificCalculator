package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Test;

//import java.io.Console;

import static org.junit.Assert.*;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
@Test
    public void addTest() {
    Double result = Console.add(3.7, 5.8);
    Double actual = 9.5;
    Assert.assertEquals(actual, result);
}
@Test
    public void subtractionTest() {

    Double result = Console.subtraction(3.6, 5.2);
    Double actual = -1.6;
    Assert.assertEquals(actual, result);
}
@Test
    public void multiplicationTest() {

    Double result = Console.multiplication(5, 6);
    Double actual = 30.0;
    Assert.assertEquals(actual, result);
}
@Test
    public void divisionTest() {

    Double result = Console.division(10, 5);
    Double actual = 2.0;
    Assert.assertEquals(actual, result);
}
@Test
    public void squareTest() {

    Double result = Console.square(10);
    Double actual = 100.0;
    Assert.assertEquals(actual, result);
}
@Test
    public void squareRootTest() {

    Double result = Console.squareRoot(100);
    Double actual = 10.0;
    Assert.assertEquals(actual, result);
}
@Test
    public void exponentsTest()

    {

        Double result = Console.exponents(5, 2);
        Double actual = 25.0;
        Assert.assertEquals(actual, result);
    }
@Test
    public void inverseTest()

    {

        Double result = Console.inverse(5);
        Double actual = 0.20;
        Assert.assertEquals(actual, result);
    }


}



