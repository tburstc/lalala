package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    //public int timeOut = 20;
    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;
    public String baseUrl= "https://www.olx.ua/";


   @BeforeMethod
    public void setup () {
           //Create Chrome driver
           driver = new ChromeDriver();
/*
           //Create a wait. All test classes use this
           wait = new WebDriverWait(driver, timeOut);
*/
           //Maximize window
           driver.manage().window().maximize();

           //Instantiate page
           page = new Page(driver);
   }

   @AfterMethod
    public void teardown(){
       driver.quit();
   }



}