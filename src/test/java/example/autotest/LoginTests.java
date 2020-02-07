package example.autotest;

import example.BaseTest;
import example.pages.AccountBar;
import example.pages.LoginPage;
import example.pages.MyAdvertPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    private String email = "terminator067067@gmail.com";
    private String password = "My_password";
    private String invalidPassword = "qwerty";
    private String expectedText = "Недопустимое значение";

    @Test(priority = 1)
          public void LoginTest() {

        //Page Method with Java Generics//
        page.open(baseUrl);

        //Initialize elements by using PageFactory
        page.GetInstance(AccountBar.class).clickUkrainianLink();
        page.GetInstance(AccountBar.class).clickMyAccountButton();

        //Chain of Invocation (Go to Login Page and then LoginToN11)
        page.GetInstance(LoginPage.class).login(email, password);

        // Assertion
        page.GetInstance(MyAdvertPage.class).waitForMessageLink();

    }
    @Test (priority = 0)
            public void InvalidPasswordLoginTest() {
                //Page Method with Java Generics//
                page.open(baseUrl);

                //Initialize elements by using PageFactory
                page.GetInstance(AccountBar.class).clickMyAccountButton();

               //Chain of Invocation (Go to Login Page and then LoginToN11)
                page.GetInstance(LoginPage.class).login(email, invalidPassword);

                // Assertion
                String actualErrorText = page.GetInstance(LoginPage.class).getErrorText();
                Assert.assertEquals(actualErrorText, expectedText);




    }
}