package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaceOrderPage extends PageBase {
    @FindBy(xpath = "//button[@title='Place Order']")
    private WebElement placeOrderBtn;
    @FindBy(css = ".base")
    private WebElement successMsg;
    @FindBy(xpath = "(//img)[2]")
    private WebElement logo;

    public PlaceOrderPage(WebDriver driver) {
        super(driver);

    }

    public void clickPlaceOrder() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrderBtn);

        // Wait for the element to be clickable
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn));

        // Use Actions class to perform the click
        new Actions(driver).moveToElement(element).click().perform();
    }

    public void clickHome() {
        logo.click();
    }

    public boolean isSucceeded() {
        return successMsg.isDisplayed();
    }
}
