package MybotsListCases;

import BaseTests.BaseTests;
import ENums.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPageSetup;
import pages.MybotsList;

public class OpenBotSettingsCase  extends BaseTests {
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
        // implicit wait //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        // Explicit wait Declare webdriverWait with 50 seconds
        WebDriverWait wait =new WebDriverWait(driver,50);
        // add condition for webdriverWait
        wait.until(ExpectedConditions.urlToBe("https://platform.widebot.net/bot/list"));
        mybotsList.OpenBotFromSettingsBTN(driver);
        //        // add condition for webdriverWait
        wait.until(ExpectedConditions.urlToBe("https://platform.widebot.net/bot-settings/12565"));
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertEquals(ActualUrl,"https://platform.widebot.net/bot-settings/12565");
    }
}
