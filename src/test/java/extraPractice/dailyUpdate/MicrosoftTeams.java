package extraPractice.dailyUpdate;

import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import extraPractice.dailyUpdate.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MicrosoftTeams {
    /*
        Main Idea: Sending a daily update automatically on fixed time.
        Steps: 1. Take update from file
               2. Open MicrosoftTeams on Browser
               3. Log in
               4. Select SDETTeam
               5. Send my update

               Create a configuration.properties file
     */


    @Test
    public void send_update(){
        // 1. Open Microsoft Teams
        Driver.getDriver().get("https://www.microsoft.com/en-us/microsoft-teams/group-chat-software");

        // 2. Sign in to account
        LoginPage obj1 = new LoginPage();
        obj1.sigInBtn.click();

        // 3. Fill the Email Input
        obj1.emailInput.sendKeys(ConfigurationReader.getUpdateProperty("myEmail"));

        // 4. Press "next"
        obj1.nextBtn.click();

        // 5. Fill the Password Input
        BrowserUtils.sleep(3);
        Driver.getDriver().navigate().refresh();
        obj1.passwordInput.sendKeys(ConfigurationReader.getUpdateProperty("myPassword"));

        // 6. Press to SignIn
        obj1.finalSignInBtn.click();

        // 7. unnecessary page
        obj1.outOfSystem.click();

        // 8. one more unnecessary page
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),40);
        wait.until(ExpectedConditions.titleContains("| Microsoft Teams"));
        obj1.webAppVer.click();

        // 9. Selecting the "Product Owners"  team
        WebElement myTeam = Driver.getDriver().findElement(By.xpath("//span[@class='single-line-truncation'][1]"));
        System.out.println("myTeam.getText() = " + myTeam.getText());


    }
}
