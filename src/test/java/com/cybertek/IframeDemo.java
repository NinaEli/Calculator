package com.cybertek;
/*
iframe/frame:they're used to put one html document inside another html document.
htmal-iframe-html
selenium can deal with / see only one html document at a time
selenium can see the iframe elemnt,but cannot see whats inside it.
in order to deal with iframe,we need to change the focus of selenium into
ifrane.we need to switch to iframe: driver.switchTo().frame();
when we switch i nto any iframe,selenkium cannot see the contents of t
he previous html.we need to switch  back to the
NESTED IFRAMES:
some pages have multiple iframe:html-iframe1,html1-iframe2-html2....

   1.driver.switchTo().defaultContent():takes us back to the top level,
   to the default content: like html2 to html1,if there are
   moultiple iframe,it doesnt matter, will go to the to level.

   2.driver.switchTo().parentFrame();-->it takes u to the parent of the current frame.
        driver.switchTo().parentFrame();>it takes me from iframe2 to iframe1
        driver.switchTo().parentFrame();takes me iframe1 to default content.

MULTIPLE IFRAMES:

 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeDemo {
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tinymce");
        //there are 2 html in this website
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.tagName("body")).sendKeys("ddee dddedd d");

        //locate the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        //switch to iframe
        driver.switchTo().frame(iframe);

        driver.switchTo().parentFrame();

        //Elemental selenium
        driver.findElement(By.linkText("Elemental Selenium")).click();
    }
}