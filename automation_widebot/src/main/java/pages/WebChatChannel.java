package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebChatChannel {
    private WebDriver driver;
    private By chatsFilter = By.id("inboxfilter_userstate");

    public WebChatChannel (WebDriver driver){
        this.driver = driver;
    }

    public void clickChatsFilter(){
        driver.findElement(chatsFilter).click();
    }

}
