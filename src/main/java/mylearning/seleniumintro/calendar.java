package mylearning.seleniumintro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
			
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		for(int i=0;i<dates.size();i++) {
			
			if(dates.get(i).getText().contains("23")) {
				
				dates.get(i).click();
				break;
			}
		}

	}

}
