package InboxCases;

import BaseTests.BaseTests;
import ENums.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InboxPage;
import pages.LoginPageSetup;
import pages.MybotsList;

public class SearchByFullName  extends BaseTests {
    LoginPageSetup loginPageSetup=new LoginPageSetup("widebotpostman@gmail.com","W!deBot12345");

    @Test
    public void SuccessSearchByFirstName() throws InterruptedException {
        Browser browser = new Browser();
        WebDriver driver=browser.LoginStep(Browsers.Chrome);
        loginPageSetup.loginWithValidData(driver);
        MybotsList mybotsList=new MybotsList(driver);
        WebDriverWait wait =new WebDriverWait(driver,50);
        // add condition for webdriverWait
        wait.until(ExpectedConditions.urlToBe("https://platform.widebot.net/bot/list"));
        mybotsList.OpenBotFromPlayground(driver);
        wait.until(ExpectedConditions.urlToBe("https://platform.widebot.net/playground/bot-builder/12565"));
        InboxPage inboxPage =new InboxPage(driver);
        inboxPage.OpenInboxTab(driver);
        wait.until(ExpectedConditions.urlToBe("https://platform.widebot.net/inbox/12565"));
        inboxPage.SearchByFirstName(driver);
        //Assertion for Search with Esraa Saeid Name
        String FirstNameInConvList = (String) inboxPage.FirstElementInConvList.toString();
        Assert.assertEquals(FirstNameInConvList,"Esraa Saeid");




    }
}
