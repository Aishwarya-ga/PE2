package com.pe2.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToCheckPowerOf4_2Test {
    ToCheckPowerOf4_2 ob;
    @Before
    public void setUp() throws Exception {
        ob = new ToCheckPowerOf4_2();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void TestpowerOf4_Success() {
        boolean expectedValue = true;
        //Act
        boolean actualValue = ob.powerOf4(16);
        //assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestpowerOf4_Failure() {
        boolean expectedValue = false;
        //Act
        boolean actualValue = ob.powerOf4(15);
        //assert
        assertEquals(expectedValue,actualValue);
    }


}