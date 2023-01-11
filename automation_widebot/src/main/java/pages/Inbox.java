package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inbox {
    private WebDriver driver;
    private By channelsFilter = By.id("inboxfilter_channels");
    private By facebook = By.id("id_Facebook");
    private By webChat = By.id("id_WebChat");
    private By whatsApp = By.id("id_WhatsApp");
    private By twitter = By.id("id_Twitter");

    public Inbox(WebDriver driver) {
        this.driver = driver;
    }

    public void clickChannels() {
        driver.findElement(channelsFilter).click();
    }

    public FacebookChannel clickFacebookChannel() {
        driver.findElement(facebook).click();
        return new FacebookChannel(driver);
    }

    public WebChatChannel clickWebChatChannel() {
        driver.findElement(webChat).click();
        return new WebChatChannel(driver);
    }

    public WhatsAppChannel clickWhatsAppChannel() {
        driver.findElement(webChat).click();
        return new WhatsAppChannel(driver);
    }

    public TwitterChannel clickTwitterChannel() {
        driver.findElement(twitter).click();
        return new TwitterChannel(driver);
    }
}

