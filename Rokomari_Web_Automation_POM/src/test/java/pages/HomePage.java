package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public String homePageURL = "https://www.rokomari.com/book";
    public By authors = By.cssSelector("#js--authors");
    public By arrow = By.xpath("//button[normalize-space()='Next']");
    public By arrow2 = By.xpath("//button[normalize-space()='Next']");
    public By Ahmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
}
