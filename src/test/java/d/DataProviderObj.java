package d;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class DataProviderObj {

    @Test (dataProvider = "employeeData")
    public  void empTest (Employee employee) {
        System.out.println("Employee testing: Data (" + employee + ")");
    }

    @DataProvider (name ="employeeData")
    public Object[][] getEmployeeData(Method m){
        return new Object[][]{
                {new Employee("Joe")},
                {new Employee("Ivan")},
                {new Employee("Sam")},
        };
    }

}
