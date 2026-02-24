package com.thetestingacademy.ex_02_Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium14_Close_Vs_Quit {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://vwo.com/campaign/get-started/?adgroup=bof_vwo_brand&utm_source=google&utm_medium=paid&utm_campaign=India_pmax_brand_bof_primary&utm_content=&utm_term=&mobile=&network=x&device=c&gad_source=1&gad_campaignid=23259635673&gbraid=0AAAAADGBh2giyWFW4hzkFyqD2T-U11dU6&gclid=Cj0KCQiAqeDMBhDcARIsAJEbU9TTJuIkUviwueDz4dvCnPjAU9CkRZVXXeUpmieqL0LLCv7jvHdfFKkaAkFaEALw_wcB");
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //a[normalize-space()="See Pricing"]

        WebElement pricing = driver.findElement(By.xpath("//a[normalize-space()=\"See Pricing\"]"));
        pricing.click();

        Thread.sleep(4000);

        driver.close();
        //Close-will close the current tab only, not the session
        //->session id!=null

        //driver.quit();
        //Quit-It will close all the tabs-session id == null

    }
}
