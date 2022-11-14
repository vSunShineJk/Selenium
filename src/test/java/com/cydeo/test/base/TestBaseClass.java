package com.cydeo.test.base;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
// This class is the parent of all test classes
// You will update this class based on what you are keep writing in your most classes


public abstract class TestBaseClass {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*

        // in your work environment you will be navigation some link, and you can
        // still use TestBase class to navigate some page for all test classes
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

         */
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
