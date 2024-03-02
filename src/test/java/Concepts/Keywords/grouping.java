package Concepts.Keywords;

import org.testng.annotations.Test;

public class grouping {

    @Test(enabled = true, priority = 0, groups = {"Regression", "Sanity", "basic"})
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(priority = 1, groups = {"Regression", "Sanity"})
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(priority = 3, groups = {"Regression", "basic"})
    public void test3() {
        System.out.println("Test 3");
    }

    @Test(dependsOnMethods = "test3")
    public void test4() {
        System.out.println("Im depending on method 'test 4'");
    }

    @Test(groups = {"dependentGroup"}, dependsOnGroups = {"basic"})
    public void test5() {
        System.out.println("Im depending on group 'basic'");
    }

}
