package com.qa.base;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class TestBase {

    public Properties prop;

    public  TestBase() throws FileNotFoundException {
        try {

            prop=new Properties();
            FileInputStream ff=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");
            prop.load(ff);


        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("hello");


        }



    }



}
