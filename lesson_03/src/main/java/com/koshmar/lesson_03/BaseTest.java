package com.koshmar.lesson_03;

import com.koshmar.lesson_03.util.Browsers;
import com.koshmar.lesson_03.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    private static WebDriver getDriver(String browserName) {
        Browsers browser = Browsers.valueOf(Properties.getDefaultBrowser(browserName).toUpperCase());
        switch (browser){
            case FIREFOX:
                System.setProperty(
                    "webdriver.gecko.driver",
                    new File(BaseTest.class.getResource("/geckodriver").getFile()).getPath());
                return new FirefoxDriver();

            case INTERNET_EXPLORER:
                System.setProperty(
                        "webdriver.ie.driver",
                        new File(BaseTest.class.getResource("/IEDriverServer").getFile()).getPath());
                return new InternetExplorerDriver();

            case CHROME:
            default:
                System.setProperty(
                        "webdriver.chrome.driver",
                        new File(BaseTest.class.getResource("/chromedriver").getFile()).getPath());
                return new ChromeDriver();

        }
    }

    public static WebDriver getConfiguredDriver(String browserName){
        WebDriver driver = getDriver(browserName);
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static void quitDriver (WebDriver driver){driver.quit();}
}
