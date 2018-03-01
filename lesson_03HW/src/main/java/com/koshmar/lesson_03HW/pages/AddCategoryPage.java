package com.koshmar.lesson_03HW.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCategoryPage {
    private EventFiringWebDriver driver;
    private By nameOfNewCategory = By.id("name_1");
    private By addCategorySaveButton = By.id("category_form_submit_btn");
    private String categoryName = "Men";

    public AddCategoryPage(EventFiringWebDriver driver) {
        this.driver = driver;
    }
    public void fillNameOfNewCategory (){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameOfNewCategory));
        driver.findElement(nameOfNewCategory).sendKeys(categoryName);
    }
    public void clickAddCategorySaveBtn (){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addCategorySaveButton));
        driver.findElement(addCategorySaveButton).click();
    }

}
