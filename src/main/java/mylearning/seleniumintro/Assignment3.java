package mylearning.seleniumintro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(5000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement list= driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		Select s=new Select(list);
		s.selectByIndex(2);
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> phones= driver.findElements(By.cssSelector("div.card-footer button.btn"));
		
		for(int i=0;i<phones.size();i++) {
			phones.get(i).click();
		}

		driver.findElement(By.partialLinkText("Checkout")).click();
	}

}
