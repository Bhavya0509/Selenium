package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String selectedBox = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		//System.out.println(selectedBox);
		
		WebElement  element= driver.findElement(By.id("dropdown-class-example"));
		Select options= new Select(element);
		options.selectByVisibleText(selectedBox);
		
		driver.findElement(By.id("name")).sendKeys(selectedBox);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText= driver.switchTo().alert().getText();
		if(alertText.contains("Option")) {
			System.out.println("Message success");
		}else {
			System.out.println("Message failed");
		}
		
		
	}

}
