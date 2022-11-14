package com.cydeo.test.day6_alerts_iframe_windows;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_iframe_practice {

    org.openqa.selenium.WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // 1. open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void iframeTask(){
        // assert: "Your content goes here." Text is displayed
        driver.switchTo().frame(0);
        WebElement goesContent = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        String actual1 = goesContent.getText();
        String expected1 = "Your content goes here.";

        Assert.assertEquals(actual1,expected1);

        // assert: "An iframe containing the TinyMCE WYSIWYG Editor"
        driver.switchTo().parentFrame();
        WebElement header = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
        String actual2 = header.getText();
        String expected2 = "An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertEquals(actual2, expected2);
    }

    @AfterClass
    public void tearDown(){
        //driver.close();
    }
}
