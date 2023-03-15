package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	private WebDriver driver;
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement loginUser;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement dashboardHeading;
	String getCards = "//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']//p[text()='titleToBeReplaced']";
	String getButtons = "//button[@title='placeholder']";
	
	

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getLoginUserName() {
		return loginUser.getText();
	}
	
	public String getDashboardHeading() {
		return dashboardHeading.getText();
	}
	
	public boolean isCardTitlePresent(String cardTitle) {
		return driver.findElement(By.xpath(getCards.replaceAll("titleToBeReplaced", cardTitle))).isDisplayed();
	}
	
	public boolean isButtonPresent(String button) {
		return driver.findElement(By.xpath(getButtons.replaceAll("placeholder", button))).isDisplayed();
	}
}
