package com.cybertek.tests;
/*
 synchronization : waits and stuff, last class in selenium api


TestNG framework: how to run groups of tests, generate reports, multi browser testing

Next classes will use the prestashop homework project.



Create a new class in the tests package: SleepAndImplicitWaitExample

this class will NOT extend the test base

Thread.sleep()  --> java method to pause the execution of a program. it can be called any line and it will pause the execution at that point

only waits when we call it, waits for full duration, not flexible


Implicit wait:

Selenium has 2 types of waits: implicit and explicit

implicit wait: it is a way of waiting while trying to find elements.
we set implicit wait once, and it always applies, we do not need to call it multiple times


implicit wait only applies to findElement method.

when we call the findElement method, if findElement cannot find element based on the locator provided, it throws NoSuchElementException.

if we have implicit wait set and if findElement cannot find element, it will keep trying to find the element. if findELement mehtod locates the element before time runs out, it will return the element. if not, it throws NoSuchElementException.
Implicit wait does not wait for duration given. it it finds the element early, it will stop waiting and simply return the element

Immplicit wait applies for that webdriver object, we use create/use a different webdriver object, we need to set the implicit wait separately


___

Implicit Wait:
•During Implicit wait if the Web Driver cannot find it immediately because of its availability, it will keep polling the DOM to get the element.
•If the element is not available within the specified Time an NoSuchElementException will be raised.
•The default setting is zero.
•Once we set a time, the Web Driver waits for the period of the WebDriver object instance.



 */
import com.cybertek.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SleepAndImplicitWaitExample {


   // @BeforeMethod
   // public void setUp(){
      //driver= Driver.getDriver();
  //  }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    private void testSleep() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("abcd");
    }





}
