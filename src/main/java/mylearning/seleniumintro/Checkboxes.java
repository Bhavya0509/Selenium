package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		//using assert 
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		
		// total number of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				
		
		
		
		

	}

}
