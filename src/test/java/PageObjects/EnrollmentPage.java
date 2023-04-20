package PageObjects;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Format;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.naming.Name;

public class EnrollmentPage {
    public EnrollmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement ContactInformationHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement PersonalInformationHeader;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement FirstNameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement LastNameField;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement Username;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement Password;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement ConfirmPassword;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement NextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[1]/div")
    private WebElement ErrorMessage;

    public String getErrorMessageText() { return this.ErrorMessage.getText();}
    public void clickOnFirstNameField() {
        this.FirstNameField.click();
    }

    public WebElement getFirstNameField() {
        return this.FirstNameField;
    }

    public void writeFirstNameToFirstNameField(String FirstName) {
        this.FirstNameField.sendKeys(FirstName);
    }

    public WebElement getLastNameField() { return this.LastNameField; }
    public void writeLastNameToLastNameField(String LastName) { this.LastNameField.sendKeys(LastName); }

    public WebElement getUsername() { return this.Username; }
    public void writeUsernameToUsernameField(String Username) { this.Username.sendKeys(Username); }

    public WebElement getPassword() {return this.Password; }
    public void writePasswordToPasswordField(String Password) { this.Password.sendKeys(Password); }

    public WebElement getConfirmPassword() {return this.ConfirmPassword; }
    public void writeConfirmPasswordToConfirmPasswordField(String ConfirmPassword) { this.ConfirmPassword.sendKeys(ConfirmPassword);}

    public String getPersonalInformationHeader() {return PersonalInformationHeader.getText(); }

    public String getContactInformationHeader() {return ContactInformationHeader.getText(); }



    public void clickOnTheNextButton() {
        this.NextButton.click();
    }

    public void fillPersonalInformation() {
        writeFirstNameToFirstNameField("Ben");
        writeLastNameToLastNameField("Smith");
        writeUsernameToUsernameField("bensmith01");
        writePasswordToPasswordField("passw0rd");
        writeConfirmPasswordToConfirmPasswordField("passw0rd");
    }



}

