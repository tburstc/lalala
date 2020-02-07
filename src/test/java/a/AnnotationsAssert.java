package a;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationsAssert {

    @Test
    public void first () {
        System.err.println("--- --- ---@Test");
        Object obj = new Object();
        /*
        Assert.assertSame(obj,1, "fail");
        Assert.assertNotSame(obj,1);
        Assert.assertTrue(1!=2);
         */
        Assert.assertFalse(1==2);
    }
    @Test (enabled = true)
    public void second () {
        System.err.println("--- --- ---@Test Second");
       // Assert.fail("It failed");
        Assert.assertTrue(true);
    }
    @Test (dependsOnMethods = "second")
    public void third () {
        System.err.println("--- --- ---@Test Third");
        Assert.assertEquals(1, 1);
    }
    @Test (timeOut = 1000)
    public void fourth () throws InterruptedException {
        System.err.println("--- --- ---@Test Fourth");
        Thread.sleep(2000);
        Assert.assertEquals(1, 1);
    }

}
