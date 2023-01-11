package dropdown;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAngular {
    private WebDriver driver;
    private NgWebDriver ngWebDriver;

    @BeforeSuite
    public void hamada(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        ngWebDriver= new NgWebDriver((JavascriptExecutor)driver);
    }

        @Test
    public void testAngular(){
            driver.get("https://platform.widebot.net/");
            Object actual = ngWebDriver.waitForAngularRequestsToFinish();

            driver.findElement(ByAngular.buttonText("Sign In with Facebook")).click();
        }
}
