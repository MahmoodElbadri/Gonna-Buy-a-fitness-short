package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShortsPage extends PageBase{
    @CacheLookup
    @FindBy(xpath = "//img[@alt='Cobalt CoolTech™ Fitness Short']")
    private WebElement blueShort;
    public ShortsPage(WebDriver driver) {
        super(driver);
    }
    public void selectBlueShort(){
        scrollDown();
        blueShort.click();
    }
}
