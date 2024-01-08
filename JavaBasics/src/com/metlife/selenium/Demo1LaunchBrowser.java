package com.metlife.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {
    public static void main(String[] args) {

        //drivers are automatically downloaded with the latest selenium jar

        WebDriver obj1=new EdgeDriver();
        WebDriver obj2=new ChromeDriver();

//        obj1=new EdgeDriver();

        obj1.get("https://www.google.com/");

        obj2.get("https://www.facebook.com/");

        //print title from browser1
        String actualTitle= obj1.getTitle();
        System.out.println(actualTitle);

        //print title from browser2
//        obj1.f

        //quit the browser 2


    }
}
