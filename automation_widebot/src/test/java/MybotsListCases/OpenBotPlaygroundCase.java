package MybotsListCases;

import ENums.Browsers;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Browser;
import pages.LoginPageSetup;
import pages.MybotsList;
public class OpenBotPlaygroundCase {
    LoginPageSetup loginPageSetup=new LoginPageSetup("widebotpostman@gmail.com","W!deBot12345");
    @Test
    public void SuccessOpenPlaygroundPageFromBotsList(){
        Browser browser = new Browser();
        WebDriver driver=browser.LoginStep(Browsers.Chrome);
        loginPageSetup.loginWithValidData(driver);
        MybotsList mybotsList=new MybotsList(driver);
        mybotsList.OpenBotFromPlayground(driver);

        String ActualUrl = driver.getCurrentUrl();
        Assert.assertEquals(ActualUrl,"https://platform.widebot.net/playground/bot-builder/12565");


    }
}
