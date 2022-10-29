package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		Actions a= new Actions(driver);
		
		//moves to specific element
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//writing text in capital letters
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
        //selecting the written text by double clicking
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //right click
        a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
	}

}
