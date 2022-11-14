package com.cydeo.test.day5_testNG_dropdown;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_SimpleDropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // 1. open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void simpleDropDown(){
        // 2. go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        // 3. verify "Simple dropdown" default selected value is correct
        // Expected: "Please select an option"
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));

        String actual=simpleDropdown.getFirstSelectedOption().getText();
        String expected="Please select an option";

        Assert.assertEquals(actual,expected);

        // 4. verify "State selection" default selected value is correct
        // Expected: "Select a State"
        Select stateDropdown = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));

        String actualState=stateDropdown.getFirstSelectedOption().getText();
        String expectedState="Select a State";

        Assert.assertEquals(actual,expected);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
