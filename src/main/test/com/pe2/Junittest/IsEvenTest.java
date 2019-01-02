package com.pe2.Junittest;
import com.pe2.junittest.EvenNumTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class IsEvenTest {
//    EvenNumTest ob;
//    @Before
//    public void setUp() throws Exception {
//        ob = new EvenNumTest();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        ob = null;
//    }

    @Test
    public void TestIsEvenSuccess(){
        boolean expectedValue_1 = true;
        //Act
        boolean actualValue_1 = EvenNumTest.isEven(12);
        //assert
        assertEquals(expectedValue_1,actualValue_1);

    }

    @Test
    public void TestIsEvenFailure(){
        boolean expectedValue_2 = false;
        //Act
        boolean actualValue_2 = EvenNumTest.isEven(13);
        //assert
        assertEquals(expectedValue_2,actualValue_2);

    }

}
