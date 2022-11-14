package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadedPage_1 {

    public DynamicLoadedPage_1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='start']")
    public WebElement startBtn;

    @FindBy(css = "div#loading")
    public WebElement loadingBar;

    @FindBy(css = "#username")
    public WebElement inputUserName;

    @FindBy(id = "pwd")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitBtn;

}
