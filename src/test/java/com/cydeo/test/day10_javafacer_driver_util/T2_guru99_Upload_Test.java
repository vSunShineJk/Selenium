package com.cydeo.test.day10_javafacer_driver_util;
import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class T2_guru99_Upload_Test {
    @Test
    public void test1() {
        Driver.getDriver().navigate().to("https://demo.guru99.com/test/upload/");

        WebElement uploadFile = Driver.getDriver().findElement(By.cssSelector("input[name='uploadfile_0']"));

        uploadFile.sendKeys("C:\\Users\\umidj\\OneDrive\\Рабочий стол\\test.txt");

        Driver.getDriver().findElement(By.id("submitbutton")).click();
        BrowserUtils.sleep(3);
        WebElement message = Driver.getDriver().findElement(By.cssSelector("h3#res > center"));
        System.out.println(message.getText());

        String expected = "1 file\n" + "has been successfully uploaded.";
        assertEquals(message.getText(), expected);

    }
}
