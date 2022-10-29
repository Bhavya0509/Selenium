package mylearning.seleniumintro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://216.250.252.161:81/");
		driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys("ajay@wiredsoft.org");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.get("http://216.250.252.161:81/admin/quotations");
		
		
		driver.findElement(By.xpath("//ol//li[1]/a")).click();
		
		
		
	}

}
