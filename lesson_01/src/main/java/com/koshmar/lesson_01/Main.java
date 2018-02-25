package com.koshmar.lesson_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();
        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement fieldSearch = driver.findElement(By.id("sb_form_q"));
        fieldSearch.sendKeys("selenium");

        WebElement button = driver.findElement(By.name("go"));
        button.click();

        List<WebElement> refers =driver.findElements(By.className("b_algo"));
        System.out.println(refers.size());

        driver.quit();

    }
    public static WebDriver initChromeDriver (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}
