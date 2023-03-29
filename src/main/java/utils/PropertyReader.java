package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static String INDEX_URL = new PropertyReader().readProperty("IndexURL");
	public static String BROWSER = new PropertyReader().readProperty("browser");
	public static String GRID = new PropertyReader().readProperty("grid");
	public static String IPADDRESS = new PropertyReader().readProperty("IPAddress");
	public static String PORT = new PropertyReader().readProperty("port");
	public static String OS = new PropertyReader().readProperty("OS");

	public String readProperty(String property) {

		File input = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\bootstrap.properties");
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(input));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (props.get(property).toString());
	}

}
