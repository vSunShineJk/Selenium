package com.cydeo.test.day10_javafacer_driver_util;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Old_driver_test {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // set up chrome and create WebDriver instance
        driver = Driver.getDriver();
    }

    @Test
    public void googleTitle(){
        driver.get("https://google.com");
        System.out.println("google test driver = " + ((RemoteWebDriver) driver).getSessionId());
    }

    @Test
    public void yahooTitle(){
        driver.get("https://yahoo.com");
        System.out.println("yahoo test driver = " + ((RemoteWebDriver) driver).getSessionId());
    }

    @Test
    public void etsyTitle(){
        driver.get("https://etsy.com");
        System.out.println("etsy test driver = " + ((RemoteWebDriver) driver).getSessionId());
    }
}
