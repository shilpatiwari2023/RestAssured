package thetestingacademy.TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("I am demo function");
        System.out.println("you are running this parameter");

        if(value.equalsIgnoreCase("firefox")){
            System.out.println("start the firefox");
        }
        if(value.equalsIgnoreCase("chrome")){
            System.out.println("start the chrome");
        }
    }
}
