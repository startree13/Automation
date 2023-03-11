package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement SubmitButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement ReadMoreButtonFromVirtual;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement WhatYouLlLearn;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[1]/img")
    private WebElement LearnFundamentals;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement RedEmailField;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement StartTheEnrollment;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement LearnFundamentalsHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement InstructorsButton;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement OurInstructorsHeader;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/h3")
    private WebElement JohnDoeTitle;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i")
    private WebElement TwitterButtonOfJohnDoe;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnWhatYouLlLearn() {this.WhatYouLlLearn.click(); }
    public void clickOnSubmitButton() {
        this.SubmitButton.click();
    }

    public void clickOnTwitterButtonOfJohnDoe() { this.TwitterButtonOfJohnDoe.click(); }

    public void writeEmailToEmailField(String email) {
        this.emailField.sendKeys(email);
    }

    public void clickOnReadMoreButtonFromVirtual() {this.ReadMoreButtonFromVirtual.click();}

    public void clickOnStartTheEnrollment() {this.StartTheEnrollment.click();}

    public WebElement getEmailField() {
        return this.emailField;
    }

    public WebElement getLearnFundamentalsHeader() {
        return this.LearnFundamentalsHeader;
    }

    public String getFundamentalsText() {
        return this.LearnFundamentalsHeader.getText();
    }

    public void clickOnInstructorsButton() {this.InstructorsButton.click(); }

    public String getOurInstructorsHeader() { return this.OurInstructorsHeader.getText();}

    public WebElement getJohnDoeTitle() {return this.JohnDoeTitle; }
}
