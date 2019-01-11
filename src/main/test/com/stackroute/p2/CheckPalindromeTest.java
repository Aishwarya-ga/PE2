package com.stackroute.p2;

import com.stackroute.p2.CheckPalindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTest {
    CheckPalindrome checkPalindrome;
    @Before
    public void setUp() throws Exception {
        checkPalindrome = new CheckPalindrome();
    }

    @After
    public void tearDown() throws Exception {
        checkPalindrome = null;
    }

    @Test
    public void TestPalindromeSuccess() throws Exception{
        String expectedValue = "12321";
        //Act
        String actualValue = checkPalindrome.checkPalindrome("12321");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestPalindromeFailure(){
        String expectedValue = "12321";
        //Act
        String actualValue = checkPalindrome.checkPalindrome("123");
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }

}