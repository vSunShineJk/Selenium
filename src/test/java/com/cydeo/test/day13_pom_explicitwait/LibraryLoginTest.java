package com.cydeo.test.day13_pom_explicitwait;

import com.cydeo.pages.LoginPage;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    LoginPage obj;

    @BeforeMethod
    public void setUp(){
        // 1. open a Chrome browser
        // 2. go to: https://lybrary2.cydeo.com
        Driver.getDriver().get("https://library2.cydeo.com");
        obj = new LoginPage();
    }

    @Test
    public void required_field_error_message_test(){

        // 3. do not enter any information
        // 4. click to "sign in" button

        obj.sigInButton.click();

        // 5. verify expected error is displayed
        // 6. expected: This field is required.
        Assert.assertTrue(obj.fieldRequiredErrorMsg.isDisplayed());
    }

    @Test
    public void invalid_email_format_test(){

        obj.inputUsername.sendKeys("lyuboy@gmail.com");
        obj.inputPassword.sendKeys("12345678");
        obj.sigInButton.click();

        Assert.assertTrue(obj.wrongEmailAndPasswordErrorMsg.isDisplayed());
    }

    @Test
    public void library_negative_login_test(){
        obj.inputUsername.sendKeys("wrong@gmail.com");
        obj.inputPassword.sendKeys("wrongPassword");
        obj.sigInButton.click();

        Assert.assertEquals(obj.wrongEmailAndPasswordErrorMsg.getText(),"Sorry, Wrong Email or Password");
    }

    @Test
    public void library_positive_login_test(){
        obj.inputUsername.sendKeys(ConfigurationReader.getProperty("libraryEmail"));
        obj.inputPassword.sendKeys(ConfigurationReader.getProperty("libraryPassword"));
        obj.sigInButton.click();

    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}
