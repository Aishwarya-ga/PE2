package com.stackroute.p2;

import com.stackroute.p2.MemberVariables;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    MemberVariables memberVariables;
    @Before
    public void setUp() throws Exception {
        memberVariables = new MemberVariables();
    }

    @After
    public void tearDown() throws Exception {
        memberVariables = null;
    }

    @Test
    public void TestMemberName(){
        String expectedValue = "Harry Potter";
        //Act
        String actualValue = memberVariables.memberName("Harry Potter");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestMemberAge(){
        int expectedValue = 30;
        //Act
        int actualValue = memberVariables.memberAge(30);
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestMemberSalary(){
        long expectedValue = 48000;
        //Act
        long actualValue = memberVariables.memberSalary(48000);
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestFailure(){
        String actualValue_1 = memberVariables.memberName(null);
        assertNull(actualValue_1);

        int actualValue_2 = memberVariables.memberAge(0);
        assertEquals(0,actualValue_2);

        long actualValue_3 = memberVariables.memberSalary(0);
        assertEquals(0,actualValue_3);

    }

}