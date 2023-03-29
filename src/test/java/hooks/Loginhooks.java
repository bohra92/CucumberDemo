package hooks;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import factory.Driverfatory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.PropertyReader;

public class Loginhooks {
	public WebDriver driver;

	@Before
	public void setup() throws MalformedURLException {
		if (PropertyReader.GRID.equals("true")) {
			driver = new Driverfatory().init_driver();

		} else {
			driver = new Driverfatory().init_driver(PropertyReader.BROWSER);
			System.out.println("inside before");
		}
	}

	@After
	public void closeDriverInstances() {
		Driverfatory.getdriver().quit();
	}
}
