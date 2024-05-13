package nhs.uk.nhsjobsearch.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import nhs.uk.nhsjobsearch.common.BrowserManager;

public class Hook extends BrowserManager {
    @Before
    public  void setup(){

        launchBrowser("chrome");
    }

    @After
    public  void teardown(){

        //closeBrowser();
    }
}
