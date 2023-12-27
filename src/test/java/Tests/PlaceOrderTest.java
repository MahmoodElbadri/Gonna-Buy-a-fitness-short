package Tests;

import Pages.PlaceOrderPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlaceOrderTest extends BaseTest {
    PlaceOrderPage order;

    @BeforeClass
    public void set() {
        order = new PlaceOrderPage(driver);
    }

    @Test
    public void completeOrder() throws InterruptedException {
        order.clickPlaceOrder();
    }

    @Test(dependsOnMethods = "completeOrder")
    public void thanked() {
        Assert.assertTrue(order.isSucceeded());
    }

    @Test(dependsOnMethods = "completeOrder")
    public void goHome() {
        order.clickHome();
    }
}
