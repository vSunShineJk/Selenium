package com.cydeo.test.day10_javafacer_driver_util;

import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;
public class T3_Hover_Test {
    @Test
    public void hover_test() {
        Driver.getDriver().navigate().to("https://practice.cydeo.com/hovers");

        List<WebElement> users = Driver.getDriver().findElements(By.cssSelector("div.figure"));
        List<WebElement> userNames = Driver.getDriver().findElements(By.xpath("//h5"));
        Actions actions = new Actions(Driver.getDriver());
        for (int i = 0; i < users.size(); i++) {
            BrowserUtils.sleep(1);
            actions.moveToElement(users.get(i)).perform();
            System.out.println("image" + i + " = " + userNames.get(i).isDisplayed());
            assertTrue(userNames.get(i).isDisplayed());
        }
    }
}
