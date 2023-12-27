package Tests;

import Data.ExcelReader;
import Pages.CheckOutPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckOutTest extends BaseTest {
    CheckOutPage check;

    @DataProvider(name = "shippingData")
    public Object[][] data() throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/Data/shipData.xlsx";
        ExcelReader er = new ExcelReader(filePath);
        return er.getExcelData(7);
    }

    @Test(dataProvider = "shippingData")
    public void enterShipping(String company, String street, String st1, String st2, String city, String post, String tel) {
        check = new CheckOutPage(driver);
        check.enterShipData(company, street, st1, st2, city, post, tel);
    }
}
