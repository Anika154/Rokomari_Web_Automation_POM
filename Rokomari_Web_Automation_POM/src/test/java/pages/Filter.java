package pages;

import org.openqa.selenium.By;

public class Filter extends BasePage{

    public String filterURL = "https://www.rokomari.com/book/author/1/humayun-ahmed";
    public By somokalin = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By uponnash = By.xpath("//label[contains(text(),'উপন্যাস সমগ্র')]");
    public By nextPage = By.xpath("//div[@class='pagination']//a[1]");
    public By select = By.xpath("//h4[contains(text(),'শ্রেষ্ঠ প্রেমের উপন্যাস')]");
    public By addCart = By.xpath("//a[@class='btn details-cart-btn-new small-cart-button js--add-to-cart js--add-to-cart-desc js--details-service-msg-eng-abtest js--details-splash-effect-abtest details-splash-effect-btn']");
    public By goCart = By.xpath("a[class='btn btn-place-order ml-2'] span");
    public By proceed = By.xpath("//span[normalize-space()='Proceed to Check Out']");

}


