package LoginCases;
import ENums.Browsers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Browser;
import pages.LoginPageSetup;
import java.util.concurrent.TimeUnit;
public class InvalidDataCase {
    LoginPageSetup loginPageSetup = new LoginPageSetup("widebotkkkpostman@gmail.com","W345");
    @Test
    public void FailLogin(){
        Browser browser = new Browser();
        browser.SetDriverForBrowser(Browsers.Chrome);
        WebDriver driver = browser.getDriver();
        driver.get("https://platform.widebot.net/auth/login");
        driver.manage().window().maximize();
        loginPageSetup.loginWithValidData(driver);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(ActualUrl,"https://platform.widebot.net/bot/list");

    }

}
