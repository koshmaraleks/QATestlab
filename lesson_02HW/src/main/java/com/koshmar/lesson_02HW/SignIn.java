package com.koshmar.lesson_02HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignIn {
    private ChromeSettings chromeSettings;
    private WebDriver driver;

    public SignIn(ChromeSettings chromeSettings) {
        this.chromeSettings = chromeSettings;
    }
    public ChromeDriver setUp (){
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public void login (){
        this.driver = this.chromeSettings.initChromeDriver();

    }

    public void typeEmail(String email) {
        WebElement fieldLogin = driver.findElement(USER_NAME);
        fieldLogin.click();
        fieldLogin.clear();
        fieldLogin.sendKeys(email);
    }

    public void typePass(String password) {
        WebElement fieldPass = driver.findElement();
        fieldPass.click();
        fieldPass.clear();
        fieldPass.sendKeys(password);
    }

//    WebElement button = driver.findElement(By.name("submitLogin"));
//        button.click();

}
