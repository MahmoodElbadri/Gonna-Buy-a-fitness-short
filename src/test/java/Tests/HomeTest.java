package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
    HomePage home;
    @Test
    public void testHome(){
        home = new HomePage(driver);
        home.clickReg();
    }
}
