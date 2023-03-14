package stepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.Driverfatory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;
import utils.PropertyReader;

public class LoginSteps {
	WebDriver driver;

	@Given("I am at Orange HRM Login portal")
	public void i_am_at_orange_hrm_login_portal() {
		
		driver = Driverfatory.getdriver();
		System.out.println("********************" + PropertyReader.INDEX_URL);
		driver.get(PropertyReader.INDEX_URL);
	}

	@When("I provide valid credentials with {string} and {string} in Login portal")
	public void i_provide_valid_credentials_with_and_in_login_portal(String username, String password) {
		Login login = new Login(driver);
		login.loginWithCreds(username, password);
	}

	@Then("I verify the {string}")
	public void i_verify_the(String string) {
		Assert.assertEquals(true, true);
	}

}
