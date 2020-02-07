package a;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MyTest {

    @BeforeMethod
    public void preconditions () {
        System.out.println("Start something");
    }

    @AfterMethod
    public void teardown () {
        System.out.println("Stop something");
    }

    @Test
    public void  MyFirstTestNGTest () {
        System.out.println("Hello TestNG !!!");
    }


}
