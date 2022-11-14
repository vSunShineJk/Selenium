package com.cydeo.test.day11_upload_actions_javaScriptExecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class T1_JavaFaker_Practice {
    @Test
    public void registration_form() {
        Faker faker = new Faker();

        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("registration.form.url"));

        WebElement firstName = Driver.getDriver().findElement(By.cssSelector("input[placeholder='first name']"));
        String name = faker.name().firstName();
        firstName.sendKeys(name);
        WebElement lastName = Driver.getDriver().findElement(By.name("lastname"));
        String surname = faker.name().lastName();
        lastName.sendKeys(surname);

        WebElement username = Driver.getDriver().findElement(By.name("username"));
        username.sendKeys(faker.name().username().replace(".", ""));

        WebElement email = Driver.getDriver().findElement(By.name("email"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement pass = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        String password = faker.internet().password();
        pass.sendKeys(password);

        WebElement tel = Driver.getDriver().findElement(By.xpath("//input[@name='phone'] "));
        //tel.sendKeys(faker.phoneNumber().cellPhone());
        tel.sendKeys(faker.numerify("###-###-####"));

        List<WebElement> genders = Driver.getDriver().findElements(By.cssSelector("input[type='radio']"));

        for (int i = 1; i <= 3; i++) {
            genders.get(faker.number().numberBetween(1,3)).click();
        }

        WebElement brYear = Driver.getDriver().findElement(By.name("birthday"));
        brYear.sendKeys(faker.numerify("03/06/2005"));

        Select dep = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));

        dep.selectByValue("DE");

        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name = 'job_title'] ")));

        jobTitle.selectByIndex(2);

        WebElement lang = Driver.getDriver().findElement(By.id("inlineCheckbox2"));
        lang.click();

        WebElement signUP = Driver.getDriver().findElement(By.id("wooden_spoon"));
        if (signUP.isEnabled()) signUP.click();

        assertEquals(Driver.getDriver().getCurrentUrl(), "https://practice.cydeo.com/registration_confirmation");
    }
}
