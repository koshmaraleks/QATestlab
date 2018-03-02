package com.koshmar.lesson_02HW;

import com.koshmar.lesson_02HW.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

    private WebDriver driver;
    private By emailInput = By.id("email");
    private By passInput = By.id("passwd");
    private By submitBtn = By.name("submitLogin");
    private String email = "webinar.test@gmail.com";
    private String password = "Xcg7299bnSmMuRLp9ITw";

    public SignIn(WebDriver driver){
        this.driver = driver;
    }
    public void open(){
        driver.get(Properties.getBaseAdminUrl());
    }
    public void fillEmailInput(){
        driver.findElement(emailInput).sendKeys(email);
    }
    public void fillPasswordInput(){
        driver.findElement(passInput).sendKeys(password);
    }
    public void clickSubmitButton(){
        driver.findElement(submitBtn).click();
    }


//    private ChromeSettings chromeSettings;
//    private WebDriver driver;
//    private static final String USER_NAME = "webinar.test@gmail.com";
//    private static final String USER_PASSWORD = "Xcg7299bnSmMuRLp9ITw";
//

//    public SignIn(ChromeSettings chromeSettings) {
//        this.chromeSettings = chromeSettings;
//    }
//    private void setUp (){
////        ChromeDriver driver = new ChromeDriver();
//        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        return driver;
//    }
//
//    public void login (){
//        this.driver = this.chromeSettings.initChromeDriver();
//        this.setUp();
//        this.typeEmail();
//        this.typePass();
//        this.clickButton();
//    }
//
//    private void typeEmail() {
//        WebElement fieldLogin = driver.findElement(By.id("email"));
//        fieldLogin.click();
//        fieldLogin.clear();
//        fieldLogin.sendKeys(USER_NAME);
//    }
//
//    private void typePass() {
//        WebElement fieldPass = driver.findElement(By.id("passwd"));
//        fieldPass.click();
//        fieldPass.clear();
//        fieldPass.sendKeys(USER_PASSWORD);
//    }
//
//    private void clickButton() {
//        WebElement button = driver.findElement(By.name("submitLogin"));
//        button.click();
//    }
//
//    public WebDriver getDriver() {
//        return driver;
//    }
}
