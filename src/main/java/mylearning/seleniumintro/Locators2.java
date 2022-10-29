package mylearning.seleniumintro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locators2 {
     
	
	public static void main(String[] args) throws InterruptedException {
		String name = "Bhavya";
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
		//xpath based on text on button
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
		
	}
	
	// extracting the new password and not giving it manually
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		 String linePassword= driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		 
		 String[] arr=linePassword.split("'");
		 //arr[0]=Please use temporary password
		 //arr[1]=rahulshettyacademy' to Login.
		 
		 String[] arr2 =arr[1].split("'");
		 
		 //arr2[0]=rahulshettyacademy
		 //arr2[1]=to Login
		 String password=arr2[0];            
		 
		 return password;
		 
		 
	}
}
