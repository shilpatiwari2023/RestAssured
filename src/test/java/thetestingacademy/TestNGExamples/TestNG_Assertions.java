package thetestingacademy.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Assertions {
    @Test(enabled = false)
    public void test_hardAssertExample(){
        System.out.println("Start of the program");
        Boolean is_Neeru_Male = false;
        Assert.assertEquals("pramod", "Pramod");
        System.out.println("End of the program");
    }
    @Test
    public void test_softAssertExample(){
        System.out.println("Start of the program");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("pramod","Pramod");
        System.out.println("End of the program");
        softAssert.assertAll();

    }
}
