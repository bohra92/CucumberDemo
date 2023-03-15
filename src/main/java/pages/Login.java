package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement errorMsg;
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/i")
	WebElement errorIcon;

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginWithCreds(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		submitBtn.click();
	}

	public String getErrorMsg() {
		return errorMsg.getText();
	}

	public boolean isErrorIconVisible() {
		return errorIcon.isDisplayed();
	}
}
