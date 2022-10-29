package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		String name = "Bhavya";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(name);
		
		driver.findElement(By.id("alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
