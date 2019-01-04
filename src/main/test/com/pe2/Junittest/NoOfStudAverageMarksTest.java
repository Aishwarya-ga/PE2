package com.pe2.Junittest;

import com.pe2.junittest.StudAverageMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class NoOfStudAverageMarksTest {
    StudAverageMarks ob;

    @Before
    public void setUp() {
        //System.out.println("Inside setup");
       ob = new StudAverageMarks();
    }
    @Test
    public void StudentAvgTestSuccess()
    {
        int[] arr = new int[]{86,65,98,77};
        int expectedValue_Min=65;

        int  actualValue_Min=ob.StudentMin(4,arr);

        assertEquals(expectedValue_Min,actualValue_Min);

        int expectedValue_Max=98;

        int  actualValue_Max=ob.StudentMax(4,arr);

        assertEquals(expectedValue_Max,actualValue_Max);

        String expectedValueAvg="81.5";

        String actualValueAvg=ob.StudentAvg(4,arr);

        assertEquals(expectedValueAvg,actualValueAvg);

    }

    @Test
    public void StudentAvgTestFailure()
    {
        int[] arr = new int[]{86,101,98,77};

        int expectedValueMin=-1;
        int  actualValueMin=ob.StudentMin(4,arr);
        assertNotEquals(expectedValueMin,actualValueMin);

        int expectedValueMax=-1;
        int  actualValueMax=ob.StudentMax(4,arr);
        assertNotEquals(expectedValueMax,actualValueMax);

        String expectedValueAvg="-1";
        String  actualValueAvg=ob.StudentAvg(4,arr);
        assertNotEquals(expectedValueAvg,actualValueAvg);

    }

    @After
    public void tearDown(){
        //System.out.println("Inside teardown");
        ob=null;
    }
}
