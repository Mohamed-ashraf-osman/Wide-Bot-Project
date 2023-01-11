package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HealthCheckQCPage {
    private WebDriver driver;
    private By botTitle = By.xpath("//div[contains(text(), 'HEALTH CHECK QC')]");
    private By testButton = By.xpath("(//li[contains(@class, nav-link)])[following :: button[@type = 'button']][11]");
    private By webChat = By.id("test-web");
    private By inbox = By.id("botInbox");

    public HealthCheckQCPage(WebDriver driver){
        this.driver = driver;
    }

    public String getBotTitle(){
        return driver.findElement(botTitle).getText();
    }

    public void clickTestButton(){
        driver.findElement(testButton).click();
    }

    public TestWebChat clickWebChat(){
        driver.findElement(webChat).click();
        return new TestWebChat(driver);
    }


    public Inbox clickInbox(){
        driver.findElement(inbox).click();
        return new Inbox(driver);
    }


    /*
    Instead of creating links for each one,
    they're all going to follow the same pattern.
    They're going to have some text,
    and this is going to be the variable.

    private void clickElement(String likeText){
        driver.findElement(By.linkText(likeText)).click();
    }
     */

}
