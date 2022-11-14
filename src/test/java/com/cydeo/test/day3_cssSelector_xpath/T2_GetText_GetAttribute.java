package com.cydeo.test.day3_cssSelector_xpath;
import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_GetText_GetAttribute {
    public static void main(String[] args) {
        // 1. Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        // 2. Go to "https://login1_nextbasecrm.com"
        driver.get("https://login1.nextbasecrm.com/");

        // 3. Verify "remember me" label text as expected
        WebElement rememberMeText = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedText = rememberMeText.getText();
        String actualText = rememberMeText.getText();

        if (actualText.equals(expectedText)){
            System.out.println("Login-passed");
        } else {
            System.out.println("Login-failed");
        }

        // 4. verify "forget password" link text is as expected.
        // Expected: Forgot your password?

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expected = "Forgot your password?";
        String actual = forgotPasswordLink.getText();

        if (actual.equals(expected)){
            System.out.println("Forgot-passed");
        } else {
            System.out.println("Forgot-failed");
        }

        String actualAttribute = forgotPasswordLink.getAttribute("href");
        System.out.println(actualAttribute);

    }
}
