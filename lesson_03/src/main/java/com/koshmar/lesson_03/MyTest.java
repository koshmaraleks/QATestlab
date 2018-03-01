package com.koshmar.lesson_03;

import com.koshmar.lesson_03.pages.DashboardPage;
import com.koshmar.lesson_03.pages.LoginPage;
import com.koshmar.lesson_03.util.Browsers;
import org.openqa.selenium.WebDriver;

public class MyTest extends BaseTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    public MyTest(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
        this.dashboardPage = new DashboardPage(driver);
    }

    public void runTestLoginPage() {
        loginPage.open();
        loginPage.fillEmailInput();
        loginPage.fillPasswordInput();
        loginPage.clickSubmitButton();

//        quitDriver(driver);
    }

    public void runTestDashboardPage(){
//        dashboardPage.clickUserIcon();
//        dashboardPage.clickExitButton();
//        dashboardPage.clickLogOutButtonWithJS();
//        dashboardPage.scrollPageDown();
        dashboardPage.selectOrdersItem();

    }

    public static void main(String[] args) throws InterruptedException {

        MyTest myTest = new MyTest(getConfiguredDriver(Browsers.CHROME.getBrowserName()));
        myTest.runTestLoginPage();
        myTest.runTestDashboardPage();

    }
}