package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
go to  http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox
 */
public class ReallyCheckboxes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //stand up precegar
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
       // System.out.println(monday.isSelected());
        //monday.click();

        //select monday only if
        if(!monday.isSelected()){
            monday.click();
        }
        System.out.println(monday.isSelected());
    }
}
