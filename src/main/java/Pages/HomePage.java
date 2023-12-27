package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    @CacheLookup
    @FindBy(xpath = "(//li)[3]")
    private WebElement regBtn;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickReg(){
        regBtn.click();
    }
}
