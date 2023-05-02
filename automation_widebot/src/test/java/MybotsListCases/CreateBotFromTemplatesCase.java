package MybotsListCases;

import BaseTests.BaseTests;
import ENums.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPageSetup;
import pages.MybotsList;

public class CreateBotFromTemplatesCase  extends BaseTests {
    LoginPageSetup loginPageSetup=new LoginPageSetup("widebotpostman@gmail.com","W!deBot12345");
    @Test
    public void SuccessCreateBotFromTemplatesCase(){
        Browser browser = new Browser();
        WebDriver driver=browser.LoginStep(Browsers.Chrome);
        loginPageSetup.loginWithValidData(driver);
        MybotsList mybotsList=new MybotsList(driver);
        WebDriverWait wait =new WebDriverWait(driver,50);
        // add condition for webdriverWait
        wait.until(ExpectedConditions.urlToBe("https://platform.widebot.net/bot/list"));
        mybotsList.CreateBotfromTemplates(driver);
    }
}
