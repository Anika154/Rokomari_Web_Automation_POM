package pages;

import org.openqa.selenium.By;

public class SignUp extends BasePage{

    public static String signUpURL = "https://www.rokomari.com/";
    public By signIn = By.xpath("//a[normalize-space()='Sign in']");
    public By google = By.xpath("//button[normalize-space()='Google']");
    public By mail = By.xpath("//input[@id='identifierId']");
    public By nextBtn1 = By.xpath("//span[normalize-space()='Next']");
    public By password = By.xpath("//input[@name='Passwd']");
    public By nextBtn2 = By.xpath("//span[normalize-space()='Next']");


    public void doLogin(String email_text, String password_text){
        clickOnElement(signIn);
        clickOnElement(google);
        writeOnElement(mail, email_text);
        clickOnElement(nextBtn1);
        writeOnElement(password, password_text);
        clickOnElement(nextBtn2);
    }
}
