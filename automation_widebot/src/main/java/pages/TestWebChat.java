package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class TestWebChat {
    private WebDriver driver;
    private By chatButton = By.id("kaec-chat-button");
    private By welcome = By.className("welcomeBTN");
    private By textArea = By.className("wc-shellinput");

    public TestWebChat(WebDriver driver){
        this.driver = driver;
    }

    public void clickChatButton(){
        driver.findElement(chatButton).click();
    }

    public void clickWelcomeMessage(){
        driver.findElement(welcome).click();
    }

    public void clickTextBox(){
        driver.findElement(textArea).click();
    }

    public void setTextArea(String text){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(textArea).sendKeys(text + Keys.ENTER);
    }

}
