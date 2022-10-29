package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
@Test
    public void addTest()
{
    Double result= Console.add(3,5);
    Double actual=8.0;
    Assert.assertEquals(actual,result);
}


}
