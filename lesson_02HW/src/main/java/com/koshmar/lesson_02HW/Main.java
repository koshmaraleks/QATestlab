package com.koshmar.lesson_02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement fieldLogin = driver.findElement(By.id("email"));
        fieldLogin.sendKeys("webinar.test@gmail.com");

        WebElement fieldPass = driver.findElement(By.id("passwd"));
        fieldPass.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button = driver.findElement(By.name("submitLogin"));
        button.click();

        WebElement userPictogram = driver.findElement(By.id("header_employee_box"));
        userPictogram.click();

        WebElement userLogout = driver.findElement(By.id("header_logout"));
        userLogout.click();

        driver.quit();

    }

    public static WebDriver initChromeDriver (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        return new ChromeDriver();
    }
}
