package com.cybertek.tests;
/*
Elements can have different states:
1.driver.findElement :will return the element
                          //doesnt care if the le,ent is displayed or not
element.isDisplayed:returns true
2.they exist onHTML but not visible on the page
3.Does not exist on HYML but visible on the page

 */
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class verifyTextDisappearTest extends TestBase {

    @Test
    public void verify() {
        driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");

        WebElement text = driver.findElement(By.id("myDIV"));
        System.out.println(text.getText());

        Assert.assertTrue(text.isSelected());
        WebElement button = driver.findElement(By.xpath("//button[.='Toggle Hide and Show']"));
        button.click();
        Assert.assertFalse(text.isDisplayed());
        //Assert.assertTrue(text.isDisplayed());


        //assertrue: expected the condition to return true
        //assertfalse: expected the condition to return false
    }

    @Test
    public void verify2() {
        driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_html_remove");
        driver.switchTo().frame("iframeResult");
        WebElement text = driver.findElement(By.xpath("//body/p"));
        System.out.println(text.getText());
        Assert.assertTrue(text.isDisplayed());

        WebElement button1 = driver.findElement(By.xpath("//body/button"));
        button1.click();
       Assert.assertFalse(elementDisplayed(By.id("//body/p")));
    }
    //  try{
    //     Assert.assertFalse(text.isDisplayed());
    //  }catch(StaleElementReferenceException e){
    //     Assert.assertTrue(true);
    //  }

        public boolean elementDisplayed(By by) {
            //try find it
            //if cant find it,return false
            try {
                return driver.findElement(by).isSelected();
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        /*COMMON EXCEPTION IN SELENIUM:
        NoSuchElementException-->locator we passed to the findElement method did'nt match anything inthe html
        findElement.vs findElements

        findElement:if matches: it'll return a webelement
                  if not match; NoSuchElementException

        findElements:if matches:list of elements with one /more element in it
                if not match:returns an empty list

         */
        public boolean elementDisplayeds(By by){
            return driver.findElements(by).isEmpty();
        }

    }

