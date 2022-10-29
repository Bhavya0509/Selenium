package mylearning.seleniumintro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(3000);
		
		List<WebElement> countries = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(int i=0;i<countries.size();i++) {
			
			if(countries.get(i).getText().equalsIgnoreCase("united kingdom (uk)")) {
				countries.get(i).click();
			}
		}
		
	}

}
