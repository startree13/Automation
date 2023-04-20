package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {

    public ContactInformation(WebDriver driver) {PageFactory.initElements(driver, this); }

    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement Email;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement Phone;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement Country;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement City;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement PostCode;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[5]/label")
    private WebElement PostcodeHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement NextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement ContactInformationHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement CourseOptionsHeader;

    public String getContactInformationHeader() {return ContactInformationHeader.getText();}

    public void EnterEmail(String email)  {this.Email.sendKeys(email);}

    public void EnterPhone(String phone) {this.Phone.sendKeys(phone);}

    public void EnterCountry(String country) {this.Country.sendKeys(country);}

    public void EnterCity(String city) {this.City.sendKeys(city);}

    public void EnterPostcode(String postcode) {this.PostCode.sendKeys(postcode);}

    public WebElement getPostcodeHeader() {return this.PostcodeHeader;}

    public void clickNextButton() {this.NextButton.click();}
}
