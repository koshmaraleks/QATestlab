package com.koshmar.lesson_02HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class ChromeSettings {

    private static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", new File(ChromeSettings.class.getResource("/chromedriver").getFile()).getPath());
        return new ChromeDriver();
    }
    public static WebDriver getConfiguredDriver(){
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public static void quitDriver(WebDriver driver){driver.quit();}

}
