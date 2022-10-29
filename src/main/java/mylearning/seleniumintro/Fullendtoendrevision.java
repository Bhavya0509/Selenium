package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Fullendtoendrevision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			
			System.out.println("webelement is not enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<4;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
        WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown=new Select(element);
		
		dropdown.selectByIndex(3);
		//Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

	}

}
