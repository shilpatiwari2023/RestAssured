package thetestingacademy.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupExample {
    //sanity = 1
    //reg = 3
    // p1 = 2
    @Test(groups = {"sanity","reg"},priority = 1)
    public void test_SanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"reg"}, priority = 2)
    public void test_RegRun(){
        System.out.println("Regression");
        Assert.assertTrue(true);
    }
    @Test(groups = {"p1","reg"},priority = 3)
    public void test_SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(true);
    }

}
