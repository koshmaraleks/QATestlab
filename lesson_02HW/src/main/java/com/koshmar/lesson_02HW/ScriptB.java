package com.koshmar.lesson_02HW;

import org.openqa.selenium.WebDriver;

public class ScriptB extends ChromeSettings{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getConfiguredDriver();
        SignIn signIn = new SignIn(driver);
        MenuItemsTest menuItemsTest = new MenuItemsTest(driver);
        SignOut signOut= new SignOut(driver);

        signIn.open();
        signIn.fillEmailInput();
        signIn.fillPasswordInput();
        signIn.clickSubmitButton();

        menuItemsTest.listOfElements();
        Thread.sleep(9000);
//        menuItemsTest.refreshPage();
//        menuItemsTest.repeatListOfElements();

//        signOut.clickOnUserPictogram();
//        signOut.clickOnSignOutBtn();

//        quitDriver(driver);
    }
}
