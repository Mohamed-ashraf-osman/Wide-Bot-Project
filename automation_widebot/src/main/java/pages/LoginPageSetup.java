package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPageSetup {


    private By signInFacebook = By.cssSelector(".col button");
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By FBloginButton = By.id("loginbutton");
    private String email ="";
    private String password="";
    public  LoginPageSetup(String email, String password)
    {
        this.email=email;
        this.password=password;
    }
    public  void loginWithValidData( WebDriver driver){
        driver.findElement(signInFacebook).click();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(FBloginButton).click();
    }

}
