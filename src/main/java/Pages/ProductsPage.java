package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase {
    @CacheLookup
    @FindBy(linkText = "Men")
    private WebElement menBtn;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    private WebElement menBottoms2;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']")
    private WebElement menPants;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-24']")
    private WebElement menShorts;

    public ProductsPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    public void goToMen() {
        actions.moveToElement(menBtn).perform();
        actions.moveToElement(menBottoms2).perform();
        actions.moveToElement(menPants).perform();
        actions.moveToElement(menShorts).perform();
        menShorts.click();
    }
}
