package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Download {

    public  static void main(String[] args) throws  InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.leafground.com/pages/upload.html");

        Actions action = new Actions (driver);

        driver.findElement(By.cssSelector("input[name]")).sendKeys("C:\\ts_events.log");

    }
}
