package mylearning.seleniumintro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
		Set<String> windows =driver.getWindowHandles();  //[parent,child]
		Iterator<String> it= windows.iterator();
		
		String parentWindowId = it.next();      //control came in set of windows
        String childWindowId =  it.next();
        
        driver.switchTo().window(childWindowId);
        
        System.out.println(driver.findElement(By.cssSelector("div.pull-left h2")).getText());
        String text = driver.findElement(By.cssSelector("div.pull-left h2")).getText();
        
        driver.switchTo().window(parentWindowId);
        
        driver.findElement(By.id("username")).sendKeys(text);
	}

}
