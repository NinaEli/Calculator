package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TabsExample {


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");

    }

    @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    /*Test case:
    go to http://the-internet.herokuapp.com/windows
    click on click "Click here"

    verify that new title is "New Window"
    verify that new title is not "The Internet"

    */
    @Test
    public void changeTab(){
        System.out.println(driver.getWindowHandles().size());
        System.out.println(driver.getWindowHandle());

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println(driver.getWindowHandles().size());
        // change to the new tab

    //set is just like arraylist without duplicates
        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("***************");
        for (String handle : windowHandles) {
            System.out.println(handle);
            // switching tabs
            driver.switchTo().window(handle);

            System.out.println(driver.getTitle());

            if (driver.getTitle().equals("New Window")){
                break;
            }
        }


        Assert.assertEquals( driver.getTitle(),"New Window");
        
    }

}



