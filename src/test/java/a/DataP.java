package a;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataP {
   @Test (dataProvider = "getData")
    public void instanceDataProvider (int p1, String p2) {
        System.out.println("Data Provider Example: Data(" +p1 + ", " + p2 +")");
    }
    @DataProvider
    public Object[][] getData() {
       return  new Object[][] {
               {5, "five"},
               {6, "six"},
               {5, "five"},
               {6, "six"}
       };
    }

}
