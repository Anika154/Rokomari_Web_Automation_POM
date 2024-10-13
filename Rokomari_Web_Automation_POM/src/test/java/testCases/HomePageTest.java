package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUp;
import utilities.DriverSetup;

public class HomePageTest extends DriverSetup {
    HomePage homePage = new HomePage();
    SignUp signUp = new SignUp();

    @BeforeMethod
    public void navigateToProductPage(){
        getDriver().get(SignUp.signUpURL);
        signUp.doLogin("anika@spaceship.com.sg","anika15@A*");
    }

    @Test
    public void testHomePageProperties() throws InterruptedException {
        getDriver().get(homePage.homePageURL);
//        homePage.clickOnElement(homePage.authors);
////        homePage.clickOnElement(homePage.arrow);
////        homePage.clickOnElement(homePage.arrow2);
        homePage.hoverForElement(homePage.authors);
        homePage.selectWithVisibleText(homePage.Ahmed,"হুমায়ূন আহমেদ");
        Thread.sleep(10000);
//        homePage.clickOnElement(homePage.Ahmed);
//
    }
}
