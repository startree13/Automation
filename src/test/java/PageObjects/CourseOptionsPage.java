package PageObjects;

public class CourseOptionsPage {

    public CourseOptionsPage(WebDriver driver) {PageFactory.initElements(driver, this); }

    @Findby (xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement CourseOptionsHeader;

    public String getCourseOptionsHeader() {return CourseOptionsHeader.getText();}

}
