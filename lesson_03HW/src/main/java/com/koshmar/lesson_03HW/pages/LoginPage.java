package com.koshmar.lesson_03HW.pages;

import com.koshmar.lesson_03HW.util.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginPage {
    private EventFiringWebDriver driver;
    private By emailInput = By.id("email");
    private By passInput = By.id("passwd");
    private By submitBtn = By.name("submitLogin");
    private String email = "webinar.test@gmail.com";
    private String password = "Xcg7299bnSmMuRLp9ITw";

    public LoginPage (EventFiringWebDriver driver){
        this.driver = driver;
    }

    public void open (){
        driver.get(Settings.BASE_URL.getValue());
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
