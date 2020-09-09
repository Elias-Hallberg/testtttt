package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @BeforeClass
    public static void beforeClass(){  //First of all
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){  // Last of all
        System.out.println("After class");
    }

    @Before
    public void before(){  //Before each test method
        System.out.println("Before");
    }

    @After
    public void after(){  //After each test method
        System.out.println("After");
    }

    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
    }

    @Test
    public void testremove() {
        List l = new List();
        l.add(1);
        l.remove();                        // Call method to test
        assertTrue(l.getLength() == 0);  // The logical check
        assertFalse(l.getLength() == 1);  // The logical check
    }

    @Test
    public void testGet() {
        List l = new List();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);// Call method to test
        int a = l.get(2);
        assertTrue(a == 2);  // The logical check
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List l = new List();
        l.add(0);
        l.get(-1); // Exception!!!
    }

    @Test
    public void testCopy() {
        List l = new List();
        l.add(1); // Call method to test
        l.add(2);
        List list = l.copy();
        int a = list.get(1);
        assertTrue(list.getLength() == 2);  // The logical check
        assertTrue(list.get(1) == 2);  // The logical check
        assertTrue(list.get(0) == 1);  // The logical check

    }
}
