package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")WebElement username;
	@FindBy(xpath = "//input[@name='password']")WebElement password;
	@FindBy(xpath = "//button[@type='submit']")WebElement submitBtn;
	
	public Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginWithCreds(String uname,String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		submitBtn.click();
	}
}
