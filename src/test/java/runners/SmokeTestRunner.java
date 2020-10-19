package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"step_definitions"},
        plugin = {"pretty","html:target/default-cucumber-reports","json:target/cucumber.json"},
        tags = {"@Smoke"},
        dryRun = false

)
public class SmokeTestRunner {
}
