package MybotsListCases;

import ENums.Browsers;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Browser;
import pages.LoginPageSetup;
import pages.MybotsList;
public class OpenBotSettingsCase {
    LoginPageSetup loginPageSetup=new LoginPageSetup("widebotpostman@gmail.com","W!deBot12345");
    @Test
    public void SuccessOpenSettingsPageFromBotsList(){
        Browser browser = new Browser();
        browser.SetDriverForBrowser(Browsers.Chrome);
        WebDriver driver = browser.getDriver();
        driver.get("https://platform.widebot.net/auth/login");
        driver.manage().window().maximize();
        loginPageSetup.loginWithValidData(driver);
        MybotsList mybotsList=new MybotsList(driver);
        mybotsList.OpenBotFromSettingsBTN(driver);
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertEquals(ActualUrl,"https://platform.widebot.net/bot-settings/12565");
    }
}
