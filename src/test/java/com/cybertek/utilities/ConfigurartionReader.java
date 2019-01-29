package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurartionReader {
    private static Properties properties;
    //bowser-->key
    //chrome-->value
    /*
    WHAT GOES TO THE CONFIG FILE?
    urls,login information,Database connection information,api urls,
    implicit wait, environment information
     */
    static{
        //this is the path to the location of the file
        String path = "configuration.properties";

        try {
            //java cannot read files directly, it needs inputstream to read files
            //inputstream takes the location of the file as a constructor
            FileInputStream fileInputStream = new FileInputStream(path);
            //properties class is use to read specifically properties files,files with key value pairs
            properties= new Properties();

            //file contents are load to properties from the inputstream
            properties.load(fileInputStream);
            //all filestream must be closed
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String property){
        return properties.getProperty(property);
    }
}
