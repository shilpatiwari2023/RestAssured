package thetestingacademy.TestNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestExample {

    @BeforeTest
    public void getToken(){
        System.out.println("Before get token");
    }
    @BeforeTest
    public void getBookingID(){
        System.out.println("Before get booking");
    }
    @Test
    public void test_put(){
        System.out.println("PUT Request");
    }
    @AfterTest
    public void closeAllThings(){
        System.out.println("Close");
    }
}
