package factory;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.PropertyReader;

public class Driverfatory {

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public static ThreadLocal<RemoteWebDriver> tlDriver1 = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {
		WebDriverManager.chromedriver().setup();
		tlDriver.set(new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*")));
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getdriver().manage().window().maximize();
		return getdriver();
	}

	public WebDriver init_driver() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "111");
		caps.setBrowserName("chrome");

		tlDriver1.set(new RemoteWebDriver(new URL(PropertyReader.IPADDRESS), caps));
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getdriver().manage().window().maximize();
		return getdriver();
	}

	public static synchronized WebDriver getdriver() {
		if(PropertyReader.GRID.equals("true")) return tlDriver1.get();
		else return tlDriver.get();
	}
}
