package Concepts.annotations;

import org.testng.annotations.*;

public class Case001 {

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("I'm Before Suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I'm Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I'm Before Method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I'm Before Test");
        /*
        this annotation runs before completion of all the test classes included in the testNg.xml.
         */

    }

    @Test
    public void test1() {
        System.out.println("I'm test 1");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I'm After Test");
        /*
        this annotation runs after completion of all the test classes included in the testNg.xml.
         */
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I'm After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I'm After Class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I'm After Suite");
    }


}
