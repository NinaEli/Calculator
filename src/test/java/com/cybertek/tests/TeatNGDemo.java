package com.cybertek.tests;

import org.testng.annotations.Test;

public class TeatNGDemo {
    @Test
    public void testOne() {
        System.out.println("Hello World");//in @Test no static ,no other method

        String expected ="a";
        String actual ="B";
        if (expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        //THIS IS NOT HOW U TEST IN TESTNG
    }
}
