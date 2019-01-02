package com.pe2.Junittest;

import com.pe2.junittest.IntegerFactorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class FactorialTest {
    IntegerFactorial obj;
    @Before
    public void setUp()  {
        obj = new IntegerFactorial();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void getFactorial1Success() {
        String actualStr = obj.getFactorial(2);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2\n";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void getFactorial2Success() {
        String actualStr = obj.getFactorial(4);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2\n" + "The factorial of 3 is 6\n" + "The factorial of 4 is 24\n";
        assertEquals(actualStr,expectedStr);
    }
}
