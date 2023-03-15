package stepDef;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestSteps {

	@Given("I am at Orange HRM Login portal test")
	public void i_am_at_orange_hrm_login_portal_test() {
		System.out.println("test step");
	}

	@Then("I should be able to see things")
	public void i_should_be_able_to_see_things() {
		Assert.assertTrue(false);
	}

}
