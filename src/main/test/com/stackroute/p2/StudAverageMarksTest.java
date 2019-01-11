package com.stackroute.p2;

import com.stackroute.p2.StudAverageMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class StudAverageMarksTest {
    StudAverageMarks studAverageMarks;

    @Before
    public void setUp() {
        //System.out.println("Inside setup");
       studAverageMarks = new StudAverageMarks();
    }
    @Test
    public void StudentAvgTestSuccess()
    {
        int[] arr = new int[]{86,65,98,77};
        int expectedValue_Min=65;
        int  actualValue_Min=studAverageMarks.StudentMin(4,arr);
        assertEquals(expectedValue_Min,actualValue_Min);

        int expectedValue_Max=98;
        int  actualValue_Max=studAverageMarks.StudentMax(4,arr);
        assertEquals(expectedValue_Max,actualValue_Max);

        String expectedValueAvg="81.5";
        String actualValueAvg=studAverageMarks.StudentAvg(4,arr);
        assertEquals(expectedValueAvg,actualValueAvg);
    }

    @Test
    public void StudentAvgTestFailure()
    {
        int[] arr = new int[]{86,101,98,77};

        int expectedValueMin=-1;
        int  actualValueMin=studAverageMarks.StudentMin(4,arr);
        assertNotEquals(expectedValueMin,actualValueMin);

        int expectedValueMax=-1;
        int  actualValueMax=studAverageMarks.StudentMax(4,arr);
        assertNotEquals(expectedValueMax,actualValueMax);

        String expectedValueAvg="-1";
        String  actualValueAvg=studAverageMarks.StudentAvg(4,arr);
        assertNotEquals(expectedValueAvg,actualValueAvg);
    }

    @After
    public void tearDown(){
        studAverageMarks=null;
    }
}
