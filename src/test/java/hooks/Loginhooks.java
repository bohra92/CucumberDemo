package hooks;

import org.openqa.selenium.WebDriver;
import factory.Driverfatory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.PropertyReader;

public class Loginhooks {
	public WebDriver driver;
	
	@Before
	public void setup() {
		driver = new Driverfatory().init_driver(PropertyReader.BROWSER);
		System.out.println("inside before");
	}
	
	@After
	public void closeDriverInstances() {
		driver.quit();
	}
}
