package pages;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private NgWebDriver ngWebDriver;
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("loginbutton");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setFacebookEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public MyBotsPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new MyBotsPage(driver);

    }
}
