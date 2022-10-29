package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//1. above
		
		String text =driver.findElement(with(By.tagName("label")).above(By.cssSelector("input[name='name']"))).getText();
		System.out.println(text);
		
		//2. below
		
		driver.findElement(with(By.tagName("input")).below(By.cssSelector("label[for='dateofBirth']"))).click();
		
		//3. toLeftOf
		
		driver.findElement(with(By.tagName("input")).toLeftOf(By.cssSelector("label[for='exampleCheck1']"))).click();
		
		//4. toRightOf
		
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(By.id("inlineRadio1"))).getText());
		

	}

}
