package thetestingacademy.TestNGExamples;

import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test(invocationCount = 3)
    public void test01(){
        System.out.println("the no of times it will run is Invocation count");
    }
    @Test(invocationCount = 2)
    public void test02(){
        System.out.println("Hello");
    }
}
