package mylearning.seleniumintro;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//getting all the links
		
		List<WebElement> links= driver.findElements(By.cssSelector(".gf-li a"));
		SoftAssert a = new SoftAssert();
		
		for(int i=0;i<links.size();i++) {
			String url = links.get(i).getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int code =conn.getResponseCode();
			if(code>400) {
				
				System.out.println("The link with text "+links.get(i).getText()+" is broken with code "+code );
				a.assertTrue(false);
			}
		}

         a.assertAll();
	}

}
