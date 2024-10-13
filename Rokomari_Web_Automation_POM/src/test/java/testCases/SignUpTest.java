package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignUp;
import utilities.DriverSetup;

public class SignUpTest extends DriverSetup {
    SignUp signUp = new SignUp();

    @BeforeMethod
    public void navigateToLoginPage(){
        getDriver().get(SignUp.signUpURL);
    }

    @Test
    public void signUpWithGoogle() throws InterruptedException {
        getDriver().get(SignUp.signUpURL);
        signUp.clickOnElement(signUp.signIn);
        signUp.clickOnElement(signUp.google);
        signUp.writeOnElement(signUp.mail,"anika@spaceship.com.sg");
        signUp.clickOnElement(signUp.nextBtn1);
        signUp.writeOnElement(signUp.password,"anika15@A*");
        signUp.clickOnElement(signUp.nextBtn2);
        Thread.sleep(1000);
    }


}
