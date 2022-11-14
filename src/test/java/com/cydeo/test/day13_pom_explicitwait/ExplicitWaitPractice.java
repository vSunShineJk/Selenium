package com.cydeo.test.day13_pom_explicitwait;

import com.cydeo.pages.DynamicLoadedPage_7;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitPractice {

    @Test
    public void dynamically_loaded_page_elements_7_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        // Wait until title is "Dynamic title"
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        //BrowserUtils.waitFotInvisibilityOf(DynamicLoadedPage_1_Test.);

        DynamicLoadedPage_7 obj = new DynamicLoadedPage_7();
        Assert.assertTrue(obj.doneMessage.isDisplayed());

//        BrowserUtils.sleep(3);
//        Assert.assertTrue(obj.spongeBobImage.isDisplayed());
    }
}
