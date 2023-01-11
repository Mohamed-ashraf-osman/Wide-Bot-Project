package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class MyBotsPage {
    private WebDriver driver;
    private By bot = By.cssSelector(".card.card-bot img");

    public MyBotsPage(WebDriver driver){
        this.driver = driver;
    }

    public HealthCheckQCPage clickHealthCheckBot(){
        driver.findElement(bot).click();
        return new HealthCheckQCPage(driver);
    }
}
