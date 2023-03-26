package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MybotsList {
    private WebDriver driver;
    private By CreateBotBTN = By.id("addBot");
    private By  CreateMarketingBot =By.cssSelector("#id_1 .card-footer button:nth-child(2)");
    private  By OpenBotSettings = By.id("#id_12565 .connectButton");
    private  By OpenBotPlayground = By.id("#id_12565 .card-image-wrapper");
    private  By CreateBlankBot = By.id("#blankBot .button-blank button");
    private  By ScrollList =By.id("#id_12565 [dropdown] button");
    //private  By DeleteBotOption = By.id("#id_13010 .dropdown .button-icon + div.dropdown-menu a:nth-child(1)");
    private  By DuplicateOption = By.id("#id_12565 .dropdown .button-icon + div.dropdown-menu a:nth-child(2)");

    public  MybotsList(WebDriver driver)
    {
        this.driver=driver;
    }
    public  void OpenBotFromSettingsBTN(WebDriver driver)
    {
        driver.findElement(OpenBotSettings).click();
    }
    public  void OpenBotFromPlayground(WebDriver driver)
    {
        driver.findElement(OpenBotPlayground).click();
    }
    public void CreateBotfromSkratsh (WebDriver driver)
    {
        driver.findElement(CreateBotBTN).click();
        driver.findElement(CreateBlankBot).click();
    }
    public void CreateBotfromTemplates (WebDriver driver)
    {  driver.findElement(CreateBotBTN).click();
        driver.findElement(CreateMarketingBot).click();
    }
   public void DeleteBotTestCase(WebDriver driver)
   {
        //driver.findElement(ScrollList).click();
        //driver.findElement(DeleteBotOption).click();
   }
    public void DuplicateBotTestCase(WebDriver driver)
    {
        driver.findElement(ScrollList).click();
        driver.findElement(DuplicateOption).click();
    }


}
