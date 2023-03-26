package LoginCases;
import ENums.Browsers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Browser;
import pages.LoginPageSetup;

import java.util.concurrent.TimeUnit;

public class ValidDataCase {
    LoginPageSetup loginPageSetup = new LoginPageSetup("widebotpostman@gmail.com","W!deBot12345");


    @Test
    public void SuccessLogin(){
        Browser browser = new Browser();
        browser.SetDriverForBrowser(Browsers.Chrome);
        WebDriver driver = browser.getDriver();
        driver.get("https://platform.widebot.net/auth/login");
        driver.manage().window().maximize();
        loginPageSetup.loginWithValidData(driver);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertEquals(ActualUrl,"https://platform.widebot.net/bot/list");
    }

    @AfterTest
    public void CloseBrowser(){
        //WebDriver driver = loginPageSetup.GetDriver();
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        //driver.close();
    }
    @DataProvider
    public Object[][] TestData()
    {
        return null;
    }
}
