package thetestingacademy.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample {
    @Test
    public void Register(){
        Assert.assertTrue(true);
    }
    @Test(alwaysRun = true )
    public void LoginPage(){
        Assert.assertTrue(true);
    }

    @Test
    public void normal(){
        Assert.assertTrue(true);
    }
}
