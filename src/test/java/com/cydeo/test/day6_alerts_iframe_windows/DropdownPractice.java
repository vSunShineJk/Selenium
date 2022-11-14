package com.cydeo.test.day6_alerts_iframe_windows;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1. open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdownTask4() throws InterruptedException {

        Select State = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));

        // 2. selecting Illinois with VisibleText
        State.selectByVisibleText("Illinois");

        Thread.sleep(2000);

        // 3. selecting Virginia with ByValue
        State.selectByValue("VA");

        Thread.sleep(2000);

        // 4. select California with ByIndex
        State.selectByIndex(5);

        // 5. verify final selected option is california
        String actual = State.getFirstSelectedOption().getText();
        String expected = "California";

        Assert.assertEquals(actual,expected);

        // finding index number from each options
        int index = -1;
        for (WebElement each : State.getOptions()){
            index++;
            if (each.getText().equals("California")){
                System.out.println(index);
            }
        }

    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }

}
