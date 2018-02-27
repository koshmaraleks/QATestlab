package com.koshmar.lesson_02HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ChromeSettings {

    WebDriver driver = initChromeDriver();

//    protected WebDriver driver;
    private static final String USER_NAME = "webinar.test@gmail.com";
    private static final String USER_PASSWORD = "Xcg7299bnSmMuRLp9ITw";

    public WebDriver initChromeDriver (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        return new ChromeDriver();
    }



    public void tearDown (){
        driver.quit();
    }

}
