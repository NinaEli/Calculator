package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.ConfigurartionReader;
import org.testng.annotations.Test;

public class LoginTestWithProperties extends TestBase{

    @Test
    public void readPropertyTest(){
        String browser = ConfigurartionReader.getProperty("browser");
                                                        // only put the key
        driver.get(ConfigurartionReader.getProperty("url"));

        HomePage homePage= new HomePage();

        String username= ConfigurartionReader.getProperty("username");
        String password= ConfigurartionReader.getProperty("password");
        homePage.login(username,password);
        System.out.println(browser);
    }
}
