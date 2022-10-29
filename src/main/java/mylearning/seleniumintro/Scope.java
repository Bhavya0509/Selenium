package mylearning.seleniumintro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		//1. Give me the count of total links on this page 
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Get the number of links in the footer of this page
		
		//This is my way
		//System.out.println(driver.findElements(By.cssSelector("div[id='gf-BIG'] a")).size());
		
		
		//Sir way is limiting the scope
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3. Find the number of links in the first column
		
		WebElement columndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4. click on each link in the column and check if the links are opening and then get titles of all windows

		for(int i=1;i< columndriver.findElements(By.tagName("a")).size();i++){
			
			String clickOnTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
			Thread.sleep(5000L);	
			
		}
		//all the tabs are opened and now we are getting titles
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
