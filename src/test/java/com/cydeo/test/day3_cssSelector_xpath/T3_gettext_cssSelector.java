package com.cydeo.test.day3_cssSelector_xpath;
import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class T3_gettext_cssSelector {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");

        webDriver.get("https://login1.nextbasecrm.com/");

        // by type:
        // webDriver.findElement(By.cssSelector("input[type='submit']")).click();

        // by value:
        // webDriver.findElement(By.cssSelector("input[value=\"Log In\"]")).click();

        //webDriver.findElement(By.cssSelector("input[class = \"login-btn\"]")).click();

        webDriver.findElement(By.cssSelector("#login-popup > form > div.log-popup-footer > input")).click();


        webDriver.quit();
    }
}
