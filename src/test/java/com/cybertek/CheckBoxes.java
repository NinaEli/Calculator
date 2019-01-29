package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
go to https://the-internet.herokuapp.com/forgot_password
verify enter email and submit
verify email sent message on the next page
"Your emal's been sent"
 */
public class CheckBoxes {
    public static void main(String[] args) {
     //blow System line is already done by somone,so we dont need to write
     //System.setProperty("asdf","asdfas");
        //setting driver path for Chrome using the webdriver manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        WebElement input = driver.findElement(By.id("email"));

        //input.sendKeys("someemasil@gmail.com"+ Keys.ENTER);
        input.sendKeys("someemasil@gmail.com");
        input.submit();//two diff waqy to hit enter

        String expected  = "Your email's been sent";
        String actual = driver.findElement(By.id("content")).getText();

        if(actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual = "+actual);
            System.out.println("expected = "+expected);
        }
        driver.close();//close google chrome,prevent too much chrome
    }
}
