package nhs.uk.nhsjobsearch.pages;

import nhs.uk.nhsjobsearch.common.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static nhs.uk.nhsjobsearch.common.DriverManager.driver;

public class JobSearchResultPage {
    public JobSearchResultPage(WebDriver driver) {
        DriverManager.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isSearchResultPageDisplayed(){
        return driver.getCurrentUrl().contains("search/results");

    }
}
