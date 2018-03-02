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
}
