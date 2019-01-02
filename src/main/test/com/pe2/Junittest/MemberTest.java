package com.pe2.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    Member_variables ob;
    @Before
    public void setUp() throws Exception {
        ob = new Member();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void TestMemberName(){
        String expectedValue = "Harry Potter";
        //Act
        String actualValue = ob.memberName("Harry Potter");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestMemberAge(){
        int expectedValue = 30;
        //Act
        int actualValue = ob.memberAge(30);
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestMemberSalary(){
        long expectedValue = 48000;
        //Act
        long actualValue = ob.memberSalary(48000);
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestFailure(){
        String actualValue_1 = ob.memberName(null);
        assertNull(ob);

        String actualValue_2 = ob.memberAge(null);
        assertNull(ob);

        String actualValue_3 = ob.memberSalary(null);
        assertNull(ob);

    }

}