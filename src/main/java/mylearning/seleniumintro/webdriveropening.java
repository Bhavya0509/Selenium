package mylearning.seleniumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriveropening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//CHROME BROWSER
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//MICROSOFT EDGE BROWSER
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		//FIREFOX BROWSER
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.redbus.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
		
		
		
	}

}
