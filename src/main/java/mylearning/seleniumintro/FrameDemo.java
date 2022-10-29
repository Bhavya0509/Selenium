package mylearning.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		// total number of frames

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		//switch to framee by index
		// then we can do it on basis of index , indexing starts from zero.

		//driver.switchTo().frame(0);
		
		// switch to frame by webelement
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		// drag and drop action

		Actions a = new Actions(driver);

		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();

		driver.switchTo().defaultContent();   //to come out of frame
	}

}
