package extraPractice.dailyUpdate.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://go.microsoft.com/fwlink/p/?linkid=873020&lm=deeplink&lmsrc=NeutralHomePageWeb&cmpid=WebSignIn&clcid=0x409&culture=en-us&country=us'")
    public WebElement sigInBtn;

    @FindBy(xpath = "//input[@id='i0116' or @name='loginfmt']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='idSIButton9' or @class='win-button button_primary button ext-button primary ext-primary']")
    public WebElement nextBtn;

    @FindBy(xpath = "//input[@id='i0118' or @name='passwd']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='idSIButton9']")
    public WebElement finalSignInBtn;

    @FindBy(xpath = "//input[@id='idBtn_Back']")
    public WebElement outOfSystem;

    @FindBy(xpath = "//a[@class='use-app-lnk']")
    public WebElement webAppVer;
}
