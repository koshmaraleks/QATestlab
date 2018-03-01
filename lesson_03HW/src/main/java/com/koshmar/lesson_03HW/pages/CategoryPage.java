package com.koshmar.lesson_03HW.pages;

import jdk.nashorn.internal.ir.IfNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage {
    private EventFiringWebDriver driver;
    private By addCategoryTab = By.id("page-header-desc-category-new_category");
    private By successfulCategoryAdding = By.xpath("/html/body/div[1]/div[2]/div[3]/div");
    private By nameFilter = By.xpath("/html/body//tr[1]/th[3]/span/a[2]/i");
    private By nameOfNewCategory = By.xpath("/html/body//tr[2]/td[3]");

    public CategoryPage(EventFiringWebDriver driver) {
        this.driver = driver;
    }
    public void clickAddCategoryBtn (){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addCategoryTab));
        driver.findElement(addCategoryTab).click();
    }
    public void messageAboutSuccessCategoryAdding (){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(successfulCategoryAdding));
        System.out.println("New category successfully added!");
    }
    public void clickNameFilterBtn (){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameFilter));
        driver.findElement(nameFilter).click();
    }
    public void newCategoryName (){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameOfNewCategory));
        System.out.println("New category added to catalog!");

    }


}
