package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingUiElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		// check wheather elements are enabled or disabled
		
				//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
				
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				
				if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
					
					System.out.println("webelement is enabled");
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}

	}

}
