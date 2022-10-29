package mylearning.seleniumintro;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it =   windows.iterator();
		
		String parentwindow = it.next();
		String childwindow = it.next();
		
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		
		String coursename =driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"))
				.get(1).getText();
		
		driver.switchTo().window(parentwindow);
		WebElement name =driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(coursename);
		
		
		// element screenshot 
		File src= name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("namescreenshot.png"));
		
		// height and width of webelement
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

	}

}
