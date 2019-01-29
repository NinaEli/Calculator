package com.cybertek.tests;
/*
Wrong email
1. go to website http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
2. try to login with wrong email
3. verify error message Invalid email address.
 */
import com.cybertek.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase{
    HomePage homePage= new HomePage();
    @Test
    public void wrongEmailTest(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        homePage.username.sendKeys("admin");
        //driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("admin");

        homePage.password.sendKeys("test");
        //driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        homePage.loginButton.click();
       //driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String error = "Invalid Login or Password.";
        String actualError = driver.findElement(By.id("ctl00_MainContent_status")).getText();

        Assert.assertEquals(error, actualError);
    }

    @Test
    public void wrongPasswordTest(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homePage.username.sendKeys("Tester");
        homePage.password.sendKeys("wrongpassword");
        homePage.loginButton.click();

        String expextedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError, expextedError);
    }
    @Test
    public void blankusername(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        homePage.open();
        homePage.login("","test");

        String expextedError= "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError, expextedError);
    }

}
