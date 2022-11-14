package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
    // Method #1 info:
    // Name: returnOrderData()
    // Return type: String
    // Arg1: WebDriver driver
    // Arg2: String costumerName
    // This method should accept a costumerName and return the costumer order data as a String.

    public static String returnOrderData(WebDriver driver, String costumerName){
        String locator = "//td[.='"+costumerName+"']/following-sibling::td[3]";

        WebElement customerOrderData = driver.findElement(By.xpath(locator));
        return customerOrderData.getText();
    }

    public static String returnOrderData(String customerName) {
        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";

        WebElement customerOrderData = Driver.getDriver().findElement(By.xpath(locator));
        return customerOrderData.getText();
    }

    // Method #2:

    public static void orderVerify(WebDriver driver, String costumerName, String expectedOrderData){
        String locator = "//td[.='"+costumerName+"']/following-sibling::td[3]"; // this element gives us an orderData location for all customers
        WebElement customerOrderData = driver.findElement(By.xpath(locator));

        String actualOrderData = customerOrderData.getText();

        Assert.assertEquals(actualOrderData,expectedOrderData);
    }
}
