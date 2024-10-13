package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DriverSetup.browserName;
import static utilities.DriverSetup.getDriver;

public class BasePage {

    public WebElement getElement(By locator) {
        return waitForElementPresent(locator);

    }

    public void clickOnElement(By locator){
        waitForElementToBeClickable(locator);
        getElement(locator).click();
    }

    public WebElement waitForElementPresent(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void hoverForElement(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement hoveredElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void writeOnElement(By locator , String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public void selectWithVisibleText(By selector, String visibleText){
        Select select = new Select(getElement(selector));
        select.selectByVisibleText(visibleText);
    }

    public String getElementText(By locator){
        return getElement(locator).getText();
    }

//    public void scrollPage(){
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,350)", "");
//    }
//    public void scrollPage2(){
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollTo(0,850)", "");
//    }


}
