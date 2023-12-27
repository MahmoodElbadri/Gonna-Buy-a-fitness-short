package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectedShortPage extends PageBase{
    @CacheLookup
    @FindBy(id="option-label-color-93-item-50")
    private WebElement blueColor;
    @CacheLookup
    @FindBy(id="qty")
    private WebElement quantityBtn;
    @CacheLookup
    @FindBy(id="product-addtocart-button")
    private WebElement addToCartBtn;
    @CacheLookup
    @FindBy(linkText = "shopping cart")
    private WebElement shoppingBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-177']")
    private WebElement size;
    public SelectedShortPage(WebDriver driver) {
        super(driver);
    }
    public void selectBlue(){
        blueColor.click();
    }
    public void setQuantity(String quantity){
        quantityBtn.clear();
        quantityBtn.sendKeys(quantity);
    }
    public void addToCart(){
        addToCartBtn.click();
    }
    public void setSize(){
        size.click();
    }
    public void clickShopping(){
        shoppingBtn.click();
    }

}
