package com.cydeo.test.day13_pom_explicitwait;

import com.cydeo.pages.DynamicLoadedPage_1;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicLoadedPage_1_Test {

    @Test
    public void dynamic_loaded_page1_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        //wait.until(ExpectedConditions.)
        DynamicLoadedPage_1 obj = new DynamicLoadedPage_1();
    }

}
