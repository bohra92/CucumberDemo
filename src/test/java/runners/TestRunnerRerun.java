package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", 
							"html:target1/cucumber.html",
							"json:target1/cucumber.json" }, 
				features = "@target/failedrerun.txt", 
				glue = { "stepDef","hooks" })

public class TestRunnerRerun {
}