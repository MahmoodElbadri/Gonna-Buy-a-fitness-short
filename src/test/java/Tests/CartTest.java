package Tests;

import Pages.CartPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    CartPage cart;

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("proceeding to the cart page")
    public void proceed() {
        cart = new CartPage(driver);
        cart.clickProceed();
    }
}
