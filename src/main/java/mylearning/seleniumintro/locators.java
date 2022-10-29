package mylearning.seleniumintro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Bhavya");
		driver.findElement(By.name("inputPassword")).sendKeys("1123456");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Bhavya");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("bhavya05@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("gargbhavya@gmail.com");
		//parent child through xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9899102428");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		//parent child through css selector
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Bhavya");
		// regular expression css selector
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		//regular expression xpath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
