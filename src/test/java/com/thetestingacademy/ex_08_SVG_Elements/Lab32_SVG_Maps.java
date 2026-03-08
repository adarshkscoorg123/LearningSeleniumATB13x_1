package com.thetestingacademy.ex_08_SVG_Elements;

import com.thetestingacademy.Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Lab32_SVG_Maps extends CommonToAll {

    @Test
    public void test_India_map_SVG() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        //driver.manage().window().maximize();

        Thread.sleep(4000);

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g'][1]/*[name()='path']"));
        for (WebElement state: states) {
            System.out.println(state.getDomAttribute("aria-label"));

            if (state.getDomAttribute("aria-label").contains("Telangana")){
                state.click();
            }//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g'][1]/*[name()='path']
        }
        Thread.sleep(4000);
        closebrowser(driver);

    }


}
