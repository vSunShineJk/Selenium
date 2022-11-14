package com.cydeo.test.day9_properties_configuration_reader;

import com.cydeo.test.base.TestBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_CRM_Login extends TestBaseClass {

    @Test
    public void crm_login_test(){
        driver.get("http://login.nextbasecrm.com/");
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("hr2@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
    }

    @Test
    public void crm_login_test2(){

    }
}
