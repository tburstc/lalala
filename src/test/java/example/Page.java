package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page extends PageGenerator {

    private int timeOut=20;

    //Create a wait for all pages.
    protected WebDriverWait wait=new WebDriverWait(this.driver, timeOut);

    public Page (WebDriver driver){
        super(driver);
    }

    //Open url
    public void open(String url) {
        driver.get(url);
    }

    // Click method by using Java Generics (You can use both By oe WebElement)
    public <T> void click (T elementAttr) {
        if (elementAttr.getClass().getName().contains("By")) {
            driver.findElement((By) elementAttr).click();
        } else {
            ((WebElement) elementAttr).click();
        }
    }

    // Bellow you can see other approach without <T> generic.
    // Two method with different parameter instead of single method with <T> generic.

    // Write Text to element via Selector
    public void  writeText(By selector, String text) {
        driver.findElement((By) selector).sendKeys(text);
    }

    // Write Text to WebElement
    public void  writeText(WebElement element, String text) {
        element.sendKeys(text);
    }

    // Get Text from By selector
    public String getText (By selector) {
        return driver.findElement(selector).getText();
    }

    //Get Text frow Webelement
    public  String getText (WebElement element) {
        return element.getText();
    }
}
