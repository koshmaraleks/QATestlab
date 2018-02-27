package com.koshmar.lesson_02HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ChromeSettings {

    WebDriver driver = initChromeDriver();

//    protected WebDriver driver;
    protected String userEmail = "webinar.test@gmail.com";
    protected String userPassword = "Xcg7299bnSmMuRLp9ITw";

    public static WebDriver initChromeDriver (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        return new ChromeDriver();
    }

    public void setUp (){
        driver = new ChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearDown (){
        driver.quit();
    }
}
