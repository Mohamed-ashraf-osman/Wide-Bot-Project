package base;

import com.google.common.io.Files;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    private NgWebDriver ngWebDriver;
    protected HomePage homePage;

    @BeforeClass
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://platform-qc.widebot.net");
        homePage = new HomePage(driver);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void recordFailure(ITestResult result){

        if(ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/test.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    }

