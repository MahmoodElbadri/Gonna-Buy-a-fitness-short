package Tests;

import Pages.ProductsPage;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest{
    ProductsPage prodsPage;
    @Test
    public void chooseBottomShorts(){
        prodsPage = new ProductsPage(driver);
        prodsPage.goToMen();
    }
}
