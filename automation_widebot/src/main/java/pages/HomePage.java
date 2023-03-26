package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By signInFacebook = By.cssSelector(".col button");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFacebook(){
        driver.findElement(signInFacebook).click();
        return new LoginPage(driver);
    }

}
