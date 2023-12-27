package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{
    @CacheLookup
    @FindBy(xpath = "//button[@data-role='proceed-to-checkout']")
    private WebElement proceedBtn;
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void clickProceed(){
        proceedBtn.click();
    }
}
