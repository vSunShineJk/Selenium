package com.cydeo.test.day5_testNG_dropdown;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SelectState {

    WebDriver driver;

    @BeforeMethod
    public void setUOMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void selectState(){
        driver.get(" http://practice.cybertekschool.com/dropdown");
    }
}
