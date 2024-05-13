package nhs.uk.nhsjobsearch.pages;

import nhs.uk.nhsjobsearch.common.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager {
    public String BASE_URL = "https://www.jobs.nhs.uk/candidate/search";

    private Select select;

    public void launchURL() {

        driver.navigate().to(BASE_URL);
    }

    public void selectElementByText(WebElement element, String text){
        Select select = new Select(element);
                select.selectByVisibleText(text);
    }

}
