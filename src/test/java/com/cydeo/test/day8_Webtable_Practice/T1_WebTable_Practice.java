package com.cydeo.test.day8_Webtable_Practice;

import com.cydeo.test.base.TestBaseClass;
import com.cydeo.test.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_WebTable_Practice extends TestBaseClass {
    WebDriver driver;

//    @BeforeMethod
//    public void setUp(){
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        // 1. Go to: https://practice.cydeo.com/web-tables
//        driver.get("https://practice.cydeo.com/web-tables");
//    }

    @Test
    public void order_name_verify_test(){
        // 2. Verify Bob's name is listed as expected.
        // Expected: "Bob Martin"
        WebElement bobMartinName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        Assert.assertEquals(bobMartinName.getText(),"Bob Martin");

        // 3. Verify Bob Martin's order date is as expected.
        // Expected; 12/31/2021
        WebElement orderData = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        Assert.assertEquals(orderData.getText(),"12/31/2021");
    }

    @Test
    public void test2(){
        String order1 = WebTableUtils.returnOrderData(driver,"Bob Martin");
        System.out.println(order1);
    }

    @Test
    public void test3(){
        WebTableUtils.orderVerify(driver,"Bob Martin","12/31/2021");
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
}
