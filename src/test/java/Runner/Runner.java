package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources"},
        tags = "",
        plugin = {"pretty","html:target/cucumber-hmtl-report","json:target/cucumber.json"},
        glue = "StepDefinitions",
        dryRun=false
)

public class Runner {
}
