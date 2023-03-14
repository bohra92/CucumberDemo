package stepDef;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class) 
@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber.html",
				"json:target/cucumber.json"},
		features ="src/test/resources/features",
		glue = {"stepDef","hooks"},
		tags = "@Login"
		) 
 
public class TestRunner { }