package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM_BasicAuthenticationAddressBook {
    public static void main(String[] args) {
        /*Basic authentication Address book
        1.Open browser
        2.Go to http://a.testaddressbook.com/sign_in
        3.Enter username kexesobepu@zsero.com
        4.Enter password password
        5.Click sign in button
        6.Verify username is displayed on page
        7.Verify the title does not include Sign In
         */

        //OPEN BROWSER
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();//driver help us to do all the work

        //GO TO http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //email saldihan yaning element ning id sisni ezdap,enter username
        driver.findElement(By.id("session_email")).sendKeys("kexesobepu@zsero.com");

        //password saldihan element nind id sisni ezdap,enter password
        driver.findElement(By.id("session_password")).sendKeys("password");

        //Click sign in button
      driver.findElement(By.name("commit")).click();

        //Verify username is displayed on page
        String expected = "Sign in";
        String actual = driver.findElement(By.id("session_email")).getText();
        if(actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("act");
        }






    }
}
