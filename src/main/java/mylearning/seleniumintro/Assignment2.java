package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Bhavya Garg");
		driver.findElement(By.name("email")).sendKeys("gargbhavya05@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Bhavii8888");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement element= driver.findElement(By.id("exampleFormControlSelect1"));
		Select options = new Select(element);
		
		options.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("05/09/1999");
		driver.findElement(By.cssSelector("input[type ='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.alert")).getText());
		

	}

}
