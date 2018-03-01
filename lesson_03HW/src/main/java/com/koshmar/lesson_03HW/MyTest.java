package com.koshmar.lesson_03HW;

import com.koshmar.lesson_03HW.pages.AddCategoryPage;
import com.koshmar.lesson_03HW.pages.CategoryPage;
import com.koshmar.lesson_03HW.pages.DashboardPage;
import com.koshmar.lesson_03HW.pages.LoginPage;
import com.koshmar.lesson_03HW.util.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class MyTest extends BaseTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private CategoryPage categoryPage;
    private AddCategoryPage addCategoryPage;

    public MyTest(EventFiringWebDriver driver) {
        this.loginPage = new LoginPage(driver);
        this.dashboardPage = new DashboardPage(driver);
        this.categoryPage = new CategoryPage(driver);
        this.addCategoryPage = new AddCategoryPage(driver);
    }

    public void runTestLoginPage() {
        loginPage.open();
        loginPage.fillEmailInput();
        loginPage.fillPasswordInput();
        loginPage.clickSubmitButton();
//        quitDriver(driver);
    }
    public void runTestDashboardPage(){
        dashboardPage.selectCategoryItem();
    }
    public void runTestCategoryPage (){
        categoryPage.clickAddCategoryBtn();
    }
    public void runTestAddCategoryPage (){
        addCategoryPage.fillNameOfNewCategory();
        addCategoryPage.clickAddCategorySaveBtn();
    }
    public void runTestCategoryPage1 () {
        categoryPage.messageAboutSuccessCategoryAdding();
        categoryPage.clickNameFilterBtn();
        categoryPage.newCategoryName();
    }

    public static void main(String[] args) throws InterruptedException {

        MyTest myTest = new MyTest(getConfiguredDriver(Browsers.CHROME.getBrowserName()));
        myTest.runTestLoginPage();
        myTest.runTestDashboardPage();
        myTest.runTestCategoryPage();
        myTest.runTestAddCategoryPage();
        myTest.runTestCategoryPage1();

    }
}
