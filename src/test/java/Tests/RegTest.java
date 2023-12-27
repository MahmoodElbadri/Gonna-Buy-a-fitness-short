package Tests;

import Data.ExcelReader;
import Pages.RegPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

public class RegTest extends BaseTest {
    RegPage reg;
    Random random;
    int randomNumber;

    @DataProvider(name = "RegistrationData")
    public Object[][] data() throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/Data/regData.xlsx";
        ExcelReader er = new ExcelReader(filePath);
        return er.getExcelData(3);
    }

    @BeforeClass
    public void beforeClass() {
        reg = new RegPage(driver);
        random = new Random();
        randomNumber = random.nextInt(9991) + 10;
    }

    @Test(dataProvider = "RegistrationData", alwaysRun = true)
    public void testReg(String fName, String lName, String pass) {

        String email = "palestinian" + randomNumber + "@test.com";
        reg.fillData(fName, lName, email, pass);
    }

    @Test(dependsOnMethods = "testReg")
    public void homePageTest() {
        reg.gotoHomePage();
    }

}
