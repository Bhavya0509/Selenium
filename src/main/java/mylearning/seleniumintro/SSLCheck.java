package mylearning.seleniumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
