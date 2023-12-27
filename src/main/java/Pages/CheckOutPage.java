package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase {

    Select dropbox;
    @FindBy(name = "company")
    private WebElement companyTxt;
    @FindBy(name = "street[0]")
    private WebElement streetTxt;
    @FindBy(name = "street[1]")
    private WebElement street1;
    @FindBy(name = "street[2]")
    private WebElement street2;
    @FindBy(name = "city")
    private WebElement cityTxt;
    @FindBy(name = "region_id")
    private WebElement stateDropDown;
    @FindBy(name = "postcode")
    private WebElement postalCodeTxt;
    @FindBy(name = "country_id")
    private WebElement countryDropBox;
    @FindBy(name = "telephone")
    private WebElement telephoneTxt;
    @FindBy(name = "ko_unique_3")
    private WebElement shipMethodBtn;
    @FindBy(css = ".button.action.continue.primary")
    private WebElement nextBtn;

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void enterShipData(String company, String street, String streetOne, String streetTwo, String city, String post, String tel) {
        companyTxt.sendKeys(company);
        streetTxt.sendKeys(street);
        street1.sendKeys(streetOne);
        street2.sendKeys(streetTwo);
        cityTxt.sendKeys(city);
        dropbox = new Select(stateDropDown);
        dropbox.selectByVisibleText("Alabama");
        postalCodeTxt.sendKeys(post);
        dropbox = new Select(countryDropBox);
        dropbox.selectByVisibleText("Palestinian Territories");
        telephoneTxt.sendKeys(tel);
        shipMethodBtn.click();
        nextBtn.click();
    }
}
