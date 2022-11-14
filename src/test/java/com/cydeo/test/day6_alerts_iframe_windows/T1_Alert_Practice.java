package com.cydeo.test.day6_alerts_iframe_windows;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {

    WebDriver WebDriver;

    @BeforeMethod
    public void setUp() {
        // 1. open Chrome browser
        WebDriver = WebDriverFactory.getDriver("chrome");
        WebDriver.manage().window().maximize();
        WebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void alertTask1() throws InterruptedException {
        // Click to "Click for JS Alert" button
        WebElement JSAlertButton = WebDriver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        Thread.sleep(2000);
        JSAlertButton.click();

        // Click to ok button from the alert
        Alert alert = WebDriver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        // verify "You successfully clicked on alert" text is displayed
        WebElement verifyText = WebDriver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(verifyText.isDisplayed());

        String actual = verifyText.getText();
        String expected = "You successfully clicked an alert";

        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        WebDriver.quit();
    }
}