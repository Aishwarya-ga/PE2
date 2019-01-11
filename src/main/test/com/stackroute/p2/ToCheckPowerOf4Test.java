package com.stackroute.p2;

import com.stackroute.p2.ToCheckPowerOf4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToCheckPowerOf4Test {
    ToCheckPowerOf4 toCheckPowerOf4;
    @Before
    public void setUp() throws Exception {
        toCheckPowerOf4 = new ToCheckPowerOf4();
    }

    @After
    public void tearDown() throws Exception {
        toCheckPowerOf4 = null;
    }

    @Test
    public void TestpowerOf4_Success() {
        boolean expectedValue = true;
        //Act
        boolean actualValue = toCheckPowerOf4.powerOf4(16);
        //assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestpowerOf4_Failure() {
        boolean expectedValue = false;
        //Act
        boolean actualValue = toCheckPowerOf4.powerOf4(33);
        //assert
        assertEquals(expectedValue,actualValue);
    }


}