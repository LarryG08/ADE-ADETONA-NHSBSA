package nhs.uk.nhsjobsearch.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/nhs/uk/nhsjobsearch/features"},
        glue = {"nhs/uk/nhsjobsearch/stepDefinitions", "nhs/uk/nhsjobsearch/hooks"},
        publish = true
)
public class TestRunner {

}
