package thetestingacademy.TestNGExamples;

import org.testng.annotations.*;

public class RealExample_AllAnnotation {
    @BeforeSuite
    public void demo1(){
        System.out.println("Read the data from Mysql");
    }
    @BeforeTest
    public void demo2(){
        System.out.println("Data in matrix, TC before");
    }
    @BeforeClass
    public void demo3(){
        System.out.println("Before class - third run");
    }
    @BeforeMethod
    public void demo4(){
        System.out.println("Before method - fourth run");
    }
    @Test
    public void demo5(){
        System.out.println("@Test - fifth run");
    }
    @AfterMethod
    public void demo6(){
        System.out.println("After method - sixth run");
    }
    @AfterClass
    public void demo7(){
        System.out.println("After class - seventh run");
    }
    @AfterTest
    public void demo8(){
        System.out.println("After test - eighth run");
    }
    @AfterSuite
    public void demo9(){
        System.out.println("After suite - ninth run");
        System.out.println("Close everything and delete temp file");
    }

}
