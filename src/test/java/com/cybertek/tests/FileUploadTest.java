package com.cybertek.tests;


/*
go to https://the-internet.herokuapp.com/upload
upload file
click upload
verify text uploaded
 */
import com.sun.corba.se.impl.orb.ParserTable;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

@Test
    public void Test(){
    driver.get("https://the-internet.herokuapp.com/upload");
}
 
}
