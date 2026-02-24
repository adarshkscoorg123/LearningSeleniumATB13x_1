package com.thetestingacademy.ex_02_Selenium_Basics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium4 {

    public static void main(String[] args) {

        //Webdriver hierarchy

        //SearchContext(Interface) -> (2)- findElement and findElements
        //WebDriver(Interface)-> 10 functions
        //->RemoteWebDriver(Class)->15 functions
        //->>Chromium Driver(Class)->25, Edge Driver(Class) (45)

        //SearchContext-Interface-FindElement and FindElements-GGF
        //WebDriver-Interface-some incomplete functions-GF
        //RemoteWebdriver-Class-It also has some functions-F
        //ChromeDriver,FirefoxDriver,EdgeDriver,SafariDriver,InternetExplorer-Classes-F

        //SearchContext driver = new EdgeDriver();
        // driver.findElement(); only two functions are there
        //driver.findElements();

        //SearchContext driver1 = new ChromeDriver();
        //SearchContext driver2 = new FirefoxDriver();

        WebDriver driver = new ChromeDriver();// dynamic dispatch
        driver.get("https://www.msn.com/en-in");
        driver.manage().window().maximize();
        String title = driver.getTitle();// Lot of functions are available
        System.out.println(title);

        RemoteWebDriver driver1 = new FirefoxDriver();
        driver1.close(); // Here also a lot of functions are available

        EdgeDriver driver2 = new EdgeDriver();
        //driver2.getBiDi(); //Here also a lot of functions are available
        driver2.close();

        // Scenarios

        //1. Do you want to run on Chrome or Edge?

        ChromeDriver driver4 = new ChromeDriver(); // 2 to 3% used
        //driver4 = new FirefoxDriver(); not possible
        driver4.close();

        //2.Do you want to run on Chrome or Firefox and then want to change to Edge

        WebDriver driver5 = new ChromeDriver(); // 95% used
        driver5 = new EdgeDriver(); // It is possible here

        //3. Do you want to run on multiple browsers, aws machine? 2 %
        //RemoteWebDriver driver6 = new ChromeDriver();
        // This is used in Selenium GRID-Advance (Last 2 sessions)
        driver5.quit();
    }

}
