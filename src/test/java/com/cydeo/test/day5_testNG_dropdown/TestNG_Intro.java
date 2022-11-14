package com.cydeo.test.day5_testNG_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @Test (priority = 1)
    public void test1(){
        System.out.println("Test1 is running...");

        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
    }

    @Test (priority = 2)
    public void mytest2(){
        System.out.println("Test2 is running...");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--> before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> after method is running...");
        System.out.println();
    }

    @BeforeClass
    public void setUp(){
        System.out.println("---> Before class is running...");
        System.out.println();
    }

    @AfterClass
    public void tearDown(){
        System.out.println("---> After class is running...");
    }
}
