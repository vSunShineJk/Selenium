package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetSpeedPage {

    public InternetSpeedPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // if there are white spaces in a locator in HTML, u can use "normalize-space()" method
    @FindBy(xpath = "//a[normalize-space()='Result']")
    public WebElement resultLink;

    @FindBy(xpath = "//span[.='Go']")
    public WebElement goButton;

    @FindBy(className = "gauge-speed-text")
    public WebElement gaugeSpeedNeedle;

    @FindBy(css = ".result-data-large.number.result-data-value.download-speed")
    public WebElement downloadSpeed;
}
