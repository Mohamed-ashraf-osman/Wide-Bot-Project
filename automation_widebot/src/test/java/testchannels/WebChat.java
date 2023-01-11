package testchannels;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HealthCheckQCPage;
import pages.LoginPage;
import pages.MyBotsPage;

public class WebChat extends BaseTests {

    @Test
    public void testWebChat(){
        LoginPage loginPage = homePage.clickFacebook();
        loginPage.setFacebookEmail("moustafa.ali1695@gmail.com");
        loginPage.setPassword("Moustafa Sherif");
        MyBotsPage botLists = loginPage.clickLoginButton();
        HealthCheckQCPage healthCheckQc =  botLists.clickHealthCheckBot();
        healthCheckQc.clickTestButton();
        var testWebChat =healthCheckQc.clickWebChat();
        getWindowManager().switchToTab("WideBot Platform");
        testWebChat.clickChatButton();
        testWebChat.clickWelcomeMessage();
        testWebChat.clickTextBox();
        testWebChat.setTextArea("H");
        getWindowManager().closeWindow();
        getWindowManager().switchToTab("WideBot Platform");
        var inbox  =healthCheckQc.clickInbox();
        //var channel = inbox.clickChannels();
        //channel.clickWebChatChannel();
    }
}
