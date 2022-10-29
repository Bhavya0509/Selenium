package mylearning.seleniumintro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggesteddropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement correctoption :options) {
			if(correctoption.getText().equalsIgnoreCase("India")) {
				correctoption.click();
				
				break;
			}
		}
	}

}
