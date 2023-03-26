package MybotsListCases;
import ENums.Browsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Browser;
import pages.LoginPageSetup;
import pages.MybotsList;
public class CreateBotFromSkratshCase {
    LoginPageSetup loginPageSetup=new LoginPageSetup("widebotpostman@gmail.com","W!deBot12345");
    @Test
    public void SuccessCreateBotFromSkratshCase(){
        Browser browser = new Browser();
        WebDriver driver=browser.LoginStep(Browsers.Chrome);
        loginPageSetup.loginWithValidData(driver);
        MybotsList mybotsList=new MybotsList(driver);
        mybotsList.CreateBotfromSkratsh(driver);
    }
}
