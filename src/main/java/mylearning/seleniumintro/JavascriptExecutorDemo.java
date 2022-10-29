package mylearning.seleniumintro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//scrolling the webpage
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//scrolling the table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//adding the values of table
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
			
			sum= sum +Integer.parseInt(values.get(i).getText()) ;
		}
		
		System.out.println(sum);
		int sumfromwebsite = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum,sumfromwebsite);
	}

}
