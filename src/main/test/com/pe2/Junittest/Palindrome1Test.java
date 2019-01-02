package com.pe2.Junittest;

import com.pe2.junittest.Palindrome1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Palindrome1Test {
    Palindrome1 ob;
    @Before
    public void setUp() throws Exception {
        ob = new Palindrome1();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void TestPalindromeSuccess() throws Exception{
        String expectedValue = "12321";
        //Act
        String actualValue = ob.checkPalindrome("12321");
        //Assert
        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void TestPalindromeFailure(){
        String expectedValue = "12321";
        //Act
        String actualValue = ob.checkPalindrome("123");
        //Assert
        assertNotEquals(expectedValue,actualValue);


    }

}