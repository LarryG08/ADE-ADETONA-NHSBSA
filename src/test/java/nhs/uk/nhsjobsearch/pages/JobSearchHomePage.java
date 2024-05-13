package nhs.uk.nhsjobsearch.pages;

import nhs.uk.nhsjobsearch.common.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSearchHomePage extends BasePage{
    public JobSearchHomePage(WebDriver driver) {
        DriverManager.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "keyword")
    private WebElement whatField;

    @FindBy(id = "location")
    private WebElement whereField;

    @FindBy(id = "distance")
    private WebElement selectSearchDistance;

    @FindBy(id = "search")
    private WebElement searchForJobButton;

    public void enterSearchKeyword (String keyword){
        whatField.sendKeys(keyword);
    }

    public void enterLocation (String location){
        whereField.sendKeys(location);

    }

    public void selectSearchDistance(String distance){
        selectElementByText(selectSearchDistance, distance);
    }

    public JobSearchResultPage clickSearchForJobButton(){
        searchForJobButton.click();
        return new JobSearchResultPage(driver);
    }
}
