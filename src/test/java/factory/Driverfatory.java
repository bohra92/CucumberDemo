package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfatory {

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {
		WebDriverManager.chromedriver().setup();
		tlDriver.set(new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*")));
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getdriver().manage().window().maximize();
		return getdriver();
	}

	public static synchronized WebDriver getdriver() {
		return tlDriver.get();
	}
}
