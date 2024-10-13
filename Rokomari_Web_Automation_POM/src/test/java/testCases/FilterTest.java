package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.Filter;
import utilities.DriverSetup;

public class FilterTest extends DriverSetup {
    Filter filter = new Filter();

    @Test
    public void testFilter() throws InterruptedException {
        getDriver().get(filter.filterURL);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scroll(0,700)", "");
        filter.clickOnElement(filter.somokalin);
        Thread.sleep(1000);

        js.executeScript("window.scroll(0,500)");
        filter.clickOnElement(filter.uponnash);
        Thread.sleep(1000);


//        filter.clickOnElement(filter.somokalin);
//        filter.clickOnElement(filter.rochona);
//        filter.clickOnElement(filter.select);
//        filter.clickOnElement(filter.addCart);
//        filter.clickOnElement(filter.goCart);
//        filter.clickOnElement(filter.proceed);
//        filter.scrollPage2();
//        filter.clickOnElement(filter.nextPage);
//        filter.clickOnElement(filter.);
//
        Thread.sleep(1000);
    }
}
