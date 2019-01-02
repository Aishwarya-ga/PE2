package com.pe2.Junittest;

import com.pe2.junittest.ToCheckPowerOf4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToCheckPowerOf4Test {
    ToCheckPowerOf4 ob;
    @Before
    public void setUp() throws Exception {
        ob = new ToCheckPowerOf4();
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
        boolean actualValue = ob.powerOf4(33);
        //assert
        assertEquals(expectedValue,actualValue);
    }


}