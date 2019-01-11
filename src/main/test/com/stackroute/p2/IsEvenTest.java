package com.stackroute.p2;
import com.stackroute.p2.EvenNumTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class IsEvenTest {
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
