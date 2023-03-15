package stepDef;

import io.cucumber.java.en.Then;
import pages.Dashboard;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.Driverfatory;
import io.cucumber.datatable.DataTable;

public class DashboardSteps {
	private Dashboard dashboard;
	private WebDriver driver;
	
	@Then("I check the title of the cards")
	public void i_check_the_title_of_the_cards(DataTable dataTable) {
		driver = Driverfatory.getdriver();
		dashboard = new Dashboard(driver);
				
		List<Map<String,String>> titles = dataTable.entries();
		Iterator<Map<String,String>> it = titles.iterator();
		while(it.hasNext()) {
			Assert.assertEquals(true,dashboard.isCardTitlePresent(it.next().get("Title")));
		}
	}
	
	@Then("I check the quick launch buttons")
	public void i_check_the_quick_launch_buttons(DataTable dataTable) {
		driver = Driverfatory.getdriver();
		dashboard = new Dashboard(driver);
		
		List<Map<String,String>> buttons = dataTable.entries();
		Iterator<Map<String,String>> it = buttons.iterator();
		while(it.hasNext()) {
			Assert.assertEquals(true,dashboard.isButtonPresent(it.next().get("Button")));
		}
		}

}
