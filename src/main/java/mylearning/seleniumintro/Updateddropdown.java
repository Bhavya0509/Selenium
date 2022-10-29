package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(1000);
        
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
