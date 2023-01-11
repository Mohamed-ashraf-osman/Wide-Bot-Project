package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HealthCheckQCPage;
import pages.LoginPage;
import pages.MyBotsPage;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
         LoginPage loginPage = homePage.clickFacebook();
         loginPage.setFacebookEmail("moustafa.ali1695@gmail.com");
         loginPage.setPassword("Moustafa Sherif");
         MyBotsPage botLists = loginPage.clickLoginButton();
         HealthCheckQCPage healthCheckQc =  botLists.clickHealthCheckBot();
         //assertEquals(healthCheckQc.getBotTitle(), "HEALTH CHECK QC", "Failed to fetch the bot title");
    }
}
