package Tests;

import Pages.SelectedShortPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectedShortTest extends BaseTest{
    SelectedShortPage sel;
    int quantity;
    String stringQuantity;
    @BeforeClass
    public void beforeClass(){
        sel = new SelectedShortPage(driver);
    }
    @Test(priority = 1)
    public void selectBlue(){
        sel.selectBlue();
    }
    @Test(priority = 2)
    public void setQuantity(){
        quantity = 5;
        stringQuantity = String.valueOf(quantity);
        sel.setQuantity(stringQuantity);
    }
    @Test(priority = 3)
    public void addToCart(){
        sel.addToCart();
    }
    @Test(priority = 0)
    public void setSize(){
        sel.setSize();
    }
    @Test(priority = 4)
    public void clickShoppingCart(){
        sel.clickShopping();
    }
}
