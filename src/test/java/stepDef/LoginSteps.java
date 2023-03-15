package stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factory.Driverfatory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Dashboard;
import pages.Login;
import utils.PropertyReader;

public class LoginSteps {
	private WebDriver driver;
	private Login login;
	private Dashboard dashboard;

	@Given("I am at Orange HRM Login portal")
	public void i_am_at_orange_hrm_login_portal() {
		
		driver = Driverfatory.getdriver();
		System.out.println("********************" + PropertyReader.INDEX_URL);
		driver.get(PropertyReader.INDEX_URL);
	}

	@When("I provide valid credentials with {string} and {string} in Login portal")
	public void i_provide_valid_credentials_with_and_in_login_portal(String username, String password) {
		login = new Login(driver);
		login.loginWithCreds(username, password);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("I verify the {string}")
	public void i_verify_the(String name) {
		dashboard = new Dashboard(driver);
		Assert.assertEquals(name.trim(),dashboard.getDashboardHeading() );
	}
	
	@When("I provide invalid credentials with {string} and {string} in Login portal")
	public void i_provide_invalid_credentials_with_and_in_login_portal(String uname, String pwd) {
		login = new Login(driver);
		login.loginWithCreds(uname, pwd);
	}

	@Then("I verify the Error Icon")
	public void i_verify_the_error_icon() {
		Assert.assertEquals(true,login.isErrorIconVisible());
	}

	@Then("I verify Error message {string}")
	public void i_verify_error_message(String errorMsg) {
		Assert.assertEquals(errorMsg,login.getErrorMsg());
		
	}

}
