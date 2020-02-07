
package a;

import org.testng.annotations.*;

public class ParamFromXML {




    @Parameters ({"p1","p2"})
    @Test()
    public void paramTest(@Optional("Abc") String paramOne, @Optional("Abc") String paramTwo) {


        System.out.println("Parameter Example: Data(" + paramOne + paramTwo + " )");
    }

}
