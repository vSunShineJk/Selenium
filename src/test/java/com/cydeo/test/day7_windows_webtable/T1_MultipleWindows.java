package com.cydeo.test.day7_windows_webtable;

import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // 1. open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void multiple_Windows_test(){
        // Assert: Title is "Window"
        String actual1 = driver.getTitle();
        String expected1 = "Windows";
        Assert.assertEquals(actual1,expected1);

        // Click to: "Click Here" Link
        WebElement click1 = driver.findElement(By.linkText("Click Here"));
        click1.click();

        // Click to: "Cydeo" Link
        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));
        cydeoLink.click();

        // Switch to Cydeo page
        Set<String> allWindows = driver.getWindowHandles();

        for (String eachWindow : allWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());

            if(driver.getTitle().equals("Cydeo")){
                break;
            }
        }

        // Assert: Title is "Cydeo"
//        Assert.assertEquals(driver.getTitle(),"Cydeo");

        BrowserUtils.verifyTitle(driver,"Cydeo");
    }

    @AfterMethod
    public void tearDown(){
//        driver.close();
          driver.quit();
    }
}
