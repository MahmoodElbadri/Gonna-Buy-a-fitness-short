package Tests;

import Pages.ShortsPage;
import org.testng.annotations.Test;

public class ShortTest extends BaseTest{
    ShortsPage shortsPage;
    @Test
    public void selectShortTest(){
        shortsPage = new ShortsPage(driver);
        shortsPage.selectBlueShort();
    }

}
