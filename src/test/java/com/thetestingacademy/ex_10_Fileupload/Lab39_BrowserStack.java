package com.thetestingacademy.ex_10_Fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab39_BrowserStack {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("user_email_login"));
        username.sendKeys("lnn76@1secmail.website");

        Thread.sleep(4000);

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("lnn76@1secmail.website");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement user_submit = driver.findElement(By.id("user_submit"));
        user_submit.click();

        WebElement uploadYourApp = driver.findElement(By.id("//div[text()=\"Upload your App\"]"));

        String user_dir = System.getProperty("user.dir");

        String path = user_dir + "/src/test/java/com/thetestingacademy/ex_10_Fileupload/testdata.txt";
        uploadYourApp.sendKeys(path);

    }
}
