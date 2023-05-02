package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InboxPage {

    private WebDriver driver;
    private By InboxTab = By.cssSelector("nav ul li:nth-child(5)");
    private By ByDate = By.cssSelector("#layout-container > app-inbox > div > div > nav > div.d-flex.mb-2.sort-search-container > div.sort.d-flex > i > app-sort-icon > svg");
    //xpath = //*[@id="layout-container"]/app-inbox/div/div/nav/div[3]/div[2]/i/app-sort-icon/svg

    private By SearchTextBox = By.xpath("//*[@id=\"searchUsers\"]");
    private  By PlayGroundTab = By.cssSelector("nav ul li:nth-child(1) ");
    public  By FirstElementInConvList= By.xpath("//*[@id=\"layout-container\"]/app-inbox/div/div/div[1]/app-inbox-user[1]/div/div/div[2]/div[1]/h5");

    public  InboxPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public   void OpenInboxTab(WebDriver driver)
    {
        driver.findElement(InboxTab).click();
    }
    public   void SearchByFirstName(WebDriver driver)
    {
        driver.findElement(SearchTextBox).click();
        driver.findElement(SearchTextBox).sendKeys("Esraa");
    }
    public   void SearchByFullName(WebDriver driver)
    {
        driver.findElement(SearchTextBox).click();
        driver.findElement(SearchTextBox).sendKeys("Esraa Saeid");
    }
    public   void SortByNewest(WebDriver driver)
    {
        driver.findElement(ByDate).click();
        driver.findElement(ByDate).click();

    }
    public   void SortByOldest(WebDriver driver)
    {
        driver.findElement(ByDate).click();

    }


}
