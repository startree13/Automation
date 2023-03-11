package org.example;

import PageObjects.EnrollmentPage;
import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();

    private MainPage mainPage;
    private EnrollmentPage enrollmentPage;


    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        enrollmentPage = new EnrollmentPage(driver);
    }


    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        driver.get("file:///C:/Users/Zmeul/Desktop/GitHub/Testing-Env/index.html#");
    }


    @When("I write the email address of {string}")
    public void IWriteTheEmailAddressOf(String string) {
        mainPage.writeEmailToEmailField(string);
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @Then("the confirmation pop-up appears")
    public void the_confirmation_pop_up_appears() {
        driver.switchTo().alert().accept();
    }

    @When("I scroll to the Read More from Virtual")
    public void i_click_on_the_read_more_button_from_virtual() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreButtonFromVirtual();
    }

    @Then("A new page with Virtual header opens")
    public void a_new_page_with_virtual_header_opens() {
        driver.getTitle();
    }

    @When("I click on What You'll Learn")
    public void clickOnWhatYouLlLearn() {
        mainPage.clickOnWhatYouLlLearn();
    }

    @Then("Learn the fundamentals will be shown")
    public void LearnTheFundamentalsWillBeShown() {
        Assert.assertEquals(mainPage.getFundamentalsText(), "Learn The Fundamentals");
    }

    @Then("the email field turns red")


    @When("I click on Start The Enrollment")
    public void clickOnStartTheEnrollment() {
        mainPage.clickOnStartTheEnrollment();
    }

    @Then("Enrollment page opens")
    public void EnrollmentPageOpens() {
        driver.get("file:///C:/Users/Zmeul/Desktop/GitHub/Testing-Env/routes/enrollment.html");
    }


    @Given("I am on the Enrollment Page")
    public void iAmOnTheEnrollmentPage() {
        driver.get("file:///C:/Users/Zmeul/Desktop/GitHub/Testing-Env/routes/enrollment.html");
    }

    @When("I click on the First Name field")
    public void IClickOnTheFirstNameField() {
        enrollmentPage.clickOnFirstNameField();
    }

    @And("I enter the First Name {string}")
    public void IEnterTheFirstName(String string) {
        enrollmentPage.writeFirstNameToFirstNameField(string);
    }

    @And("I enter the Last Name {string} on the Last Name field")
    public void IEnterTheLastName(String string) { enrollmentPage.writeLastNameToLastNameField(string); }

    @And("I enter the Username {string} in the Username field")
    public void IEnterTheUsername(String string) { enrollmentPage.writeUsernameToUsernameField(string); }

    @And("I enter the Password {string} in the Password field")
    public void IEnterThePassword(String string) { enrollmentPage.writePasswordToPasswordField(string); }

    @And("I enter the Password {string} in the Confirm Password field")
    public void IEnterThePasswordToConfirmPassword(String string) { enrollmentPage.writeConfirmPasswordToConfirmPasswordField(string);}

    @And("I click on the Next Button")
    public void i_click_on_the_Next_Button() {
        Utils.scrollToElement(driver, enrollmentPage.getConfirmPassword());
        enrollmentPage.clickOnTheNextButton(); }

    @Then("The user is still on Personal Information page")
    public void the_user_is_still_on_personal_information_page() {
        Assert.assertEquals(enrollmentPage.getPersonalInformationHeader(), "Personal information"); }

    @Then("Contact Information page opens")
    public void contact_information_page_opens() {
        Assert.assertEquals(enrollmentPage.getContactInformationHeader(), "Contact information"); }


        @After
        public void cleanUp() {
            driver.quit();
        }
    }