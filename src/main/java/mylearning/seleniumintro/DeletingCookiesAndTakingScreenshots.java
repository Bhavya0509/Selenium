package mylearning.seleniumintro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class DeletingCookiesAndTakingScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximizing window
		driver.manage().window().maximize();
		
		//deleting cookies
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.com");
		
		//taking screenshots
		 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File ("C:\\Users\\2046171\\screenshot.png"));
		
		
		
	}

}
