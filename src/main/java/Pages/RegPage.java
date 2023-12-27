package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegPage extends PageBase{
    @CacheLookup
    @FindBy(id = "firstname")
    private WebElement fNameTxtBox;
    @CacheLookup
    @FindBy(id = "lastname")
    private WebElement lNameTxtBox;
    @CacheLookup
    @FindBy(id = "email_address")
    private WebElement emailTxtBox;
    @CacheLookup
    @FindBy(id = "password")
    private WebElement passTxtBox;
    @CacheLookup
    @FindBy(id = "password-confirmation")
    private WebElement cPassTxtBox;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Create an Account')])[1]")
    private WebElement signUpBtn;
    @CacheLookup
    @FindBy(xpath = "(//img)[1]")
    private WebElement storeLogo;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement sucMsg;
    By successMsg = By.xpath("//div[@role='alert']");
    public RegPage(WebDriver driver) {
        super(driver);
    }
    public void fillData(String fName,String lName,String email,String pass){
        scrollDown();
        cPassTxtBox.sendKeys(pass);
        lNameTxtBox.sendKeys(lName);
        fNameTxtBox.sendKeys(fName);
        passTxtBox.sendKeys(pass);
        emailTxtBox.sendKeys(email);
        signUpBtn.click();
    }
    public void gotoHomePage(){
        storeLogo.click();
    }

}
