package pages;

import org.openqa.selenium.By;

public class SignOut extends BasePage{

    public String signOutURL = "https://www.rokomari.com/book";
    public By downArrow = By.xpath("//i[@class='ion-arrow-down-b']");
    public By signOut = By.xpath("//a[normalize-space()='Sign Out']");

}
