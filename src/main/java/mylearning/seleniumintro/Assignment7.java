package mylearning.seleniumintro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.qaclickacademy.com/practice.php");
		
		int noOfRows =driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr")).size();
		
		System.out.println(noOfRows);
		
		int noOfColumns = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr/th")).size();
		
		System.out.println(noOfColumns);
		
		List<WebElement> secondRow= driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[3]/td"));
		
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());

	}

}
