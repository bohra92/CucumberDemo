package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class) 
@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber.html",
				"json:target/cucumber.json",
				"rerun:target/failedrerun.txt"},
		features ="src/test/resources/features",
		dryRun = false,
		glue = {"stepDef","hooks"},
		tags = ""
		) 
 
public class RunCucumberIT { }



