package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignOut;
import pages.SignUp;
import utilities.DriverSetup;

public class SignOutTest extends DriverSetup {
    SignUp signUp = new SignUp();
    SignOut signOut = new SignOut();

    @BeforeMethod
    public void navigateToProductPage(){
        getDriver().get(SignUp.signUpURL);
        signUp.doLogin("anika@spaceship.com.sg","anika15@A*");
    }

    @Test
    public void testSignOut() throws InterruptedException {
//        getDriver().get(signOut.signOutURL);
        signOut.clickOnElement(signOut.downArrow);
        Thread.sleep(1000);
        signOut.clickOnElement(signOut.signOut);

    }
}
