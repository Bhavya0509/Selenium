package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for authentucation popup we use use driver.get(http://username:password@url)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();

	}

}
