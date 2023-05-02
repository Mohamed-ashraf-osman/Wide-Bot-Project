package BaseTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import ENums.Browsers;
import pages.LoginPageSetup;

public class BaseTests {


    public class Browser {
        WebDriver driver;
        protected LoginPageSetup loginPageSetup;
        public void SetDriverForBrowser(Browsers browsers) {

            if(browsers.equals(Browsers.Chrome))
            {
                System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver.exe");
                driver = new ChromeDriver();
            }
            else if (browsers.equals(Browsers.Edage))
            {
                System.setProperty("webdriver.Edage.driver", ".//resources//msedgedriver.exe");
                driver = new EdgeDriver();
            }
            else if (browsers.equals(Browsers.Opera))
            {
                System.setProperty("webdriver.Opera.driver", ".//resources//operadriver.exe");
                driver = new OperaDriver();
            }
            else if (browsers.equals(Browsers.Mozilla))
            {
                System.setProperty("webdriver.mozilla.driver", ".//resources//geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }
        public WebDriver LoginStep( Browsers browserType){
            SetDriverForBrowser(browserType);
            WebDriver driver = getDriver();
            driver.get("https://platform.widebot.net/auth/login");
            driver.manage().window().maximize();
            return  driver;
        }
        public WebDriver getDriver() {
            return driver;
        }
    }

}
