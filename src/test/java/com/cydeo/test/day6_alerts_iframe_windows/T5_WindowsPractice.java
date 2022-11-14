package com.cydeo.test.day6_alerts_iframe_windows;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {

    org.openqa.selenium.WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // 1. open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void windowTesting(){
        // assert: title is "Windows"
        String actual = driver.getTitle();
        String expected = "Windows";

        Assert.assertEquals(actual, expected);

        // click to "click here" button
        WebElement button = driver.findElement(By.xpath("//*[@id='content']/div/a"));
        button.click();

        System.out.println("Before switching - " + actual);

        // switch to New Window
        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
        }

        System.out.println("After switching - " + driver.getTitle());

        // assert: title "New Window"
        String actual2 = driver.getTitle();
        String expected2 = "New Window";

        Assert.assertEquals(actual,expected);
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }
}
