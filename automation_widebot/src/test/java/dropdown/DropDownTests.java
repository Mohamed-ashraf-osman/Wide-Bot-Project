package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HealthCheckQCPage;
import pages.LoginPage;
import pages.MyBotsPage;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectOpenedFilter(){
        LoginPage loginPage = homePage.clickFacebook();
        loginPage.setFacebookEmail("moustafa.ali1695@gmail.com");
        loginPage.setPassword("Moustafa Sherif");
        MyBotsPage botLists = loginPage.clickLoginButton();
        HealthCheckQCPage healthCheckQc =  botLists.clickHealthCheckBot();
        var inbox = healthCheckQc.clickInbox();
        inbox.clickChannels();
        inbox.clickWebChatChannel();
    }
}
