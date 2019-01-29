package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CraiglistTest {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://washingtondc.craigslist.org/");

       // driver.findElement(By.name("query")).sendKeys("corolla");/
       //if the class name has spaces,we cannot use it
       //driver.findElement(By.linkText("electronics")).click();//bassak yana bir bat eqildu

        driver.findElement(By.partialLinkText("+garden")).click();//take half of (farm+garden)the text


        /*
        LINKTEXT:
        uses the exact,it has to match100percent including spaces

        PARCIALLINKTEXT:
         */

        /*
        TOOLS:

        <SCOPE>TEST</SCOPE>->it means only the code in the
        in testng/Junit, we use annotations
        @Test mean the method we're writing is a unit test,we dont need to

         */

    }
}
