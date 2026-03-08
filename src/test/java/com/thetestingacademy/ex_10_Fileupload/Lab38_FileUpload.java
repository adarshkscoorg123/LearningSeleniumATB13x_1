package com.thetestingacademy.ex_10_Fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab38_FileUpload {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        WebElement chooseFile = driver.findElement(By.id("fileToUpload"));

        String user_dir = System.getProperty("user.dir"); // /Users/adarshks/IdeaProjects/LearningSeleniumATB13x/

        // user.dir = /Users/adarshks/IdeaProjects/LearningSeleniumATB13x/
        // /src/java/com/thetestingacademy/ex_10_Fileupload/testdata.txt

        String path = user_dir + "/src/test/java/com/thetestingacademy/ex_10_Fileupload/testdata.txt";
        chooseFile.sendKeys(path);

        WebElement uploadFile = driver.findElement(By.name("submit"));
        uploadFile.click();

    }
}
