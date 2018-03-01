package com.koshmar.lesson_03HW.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    private EventFiringWebDriver driver;
    private By categoryTab = By.id("subtab-AdminCatalog");

    public DashboardPage (EventFiringWebDriver driver){
        this.driver = driver;
    }

    public void selectCategoryItem (){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(categoryTab));

        WebElement orderTabElement = driver.findElement(categoryTab);
        Actions actions = new Actions(driver);
        actions.moveToElement(orderTabElement).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subtab-AdminCategories")));
        orderTabElement.findElements(By.cssSelector("li")).get(1).click();
    }
}
