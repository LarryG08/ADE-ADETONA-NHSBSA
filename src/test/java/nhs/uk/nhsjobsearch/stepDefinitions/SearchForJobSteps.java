package nhs.uk.nhsjobsearch.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import nhs.uk.nhsjobsearch.pages.BasePage;
import nhs.uk.nhsjobsearch.pages.JobSearchHomePage;
import nhs.uk.nhsjobsearch.pages.JobSearchResultPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchForJobSteps extends BasePage {
    JobSearchHomePage jobSearchHomePage = new JobSearchHomePage(driver);
    JobSearchResultPage jobSearchResultPage = new JobSearchResultPage(driver);

    @Given("I navigate to the NHS Jobs search homepage")
    public void i_navigate_to_the_nhs_jobs_search_homepage() {
    launchURL();
    }
    @When("I enter my search {string} in the what field")
    public void iEnterMySearchInTheWhatField(String keyword) {
    jobSearchHomePage.enterSearchKeyword(keyword);

    }
    @And("I enter {string} in the where field")
    public void iEnterInTheWhereField(String location) {
    jobSearchHomePage.enterLocation(location);
    }

    @And("I select the search {string}")
    public void iSelectTheSearch(String distance) {
        jobSearchHomePage.selectSearchDistance(distance);
    }

    @And("I click on Search button")
    public void iClickOnSearchButton() {
        jobSearchHomePage.clickSearchForJobButton();
    }

    @And("I verify that search result page is displayed")
    public void iVerifyThatSearchResultPageIsDisplayed() {
        boolean res = jobSearchResultPage.isSearchResultPageDisplayed();
        Assert.assertTrue(res);
    }

    @Then("I should get a list of jobs which matches my preferences sorted with the newest Date Posted")
    public void iShouldGetAListOfJobsWhichMatchesMyPreferencesSortedWithTheNewestDatePosted() {
    }
}
