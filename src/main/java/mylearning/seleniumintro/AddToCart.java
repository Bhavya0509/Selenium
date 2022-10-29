package mylearning.seleniumintro;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        
        String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
        addItems(driver,itemsNeeded);
        
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        
        //explicit wait
        WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(5));
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        
        
		
        //after code is applied this is for checkout
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        WebElement ele =driver.findElement(By.cssSelector("select[style='width: 200px;']"));
        Select option = new Select(ele);
        
        option.selectByVisibleText("India");
        
        driver.findElement(By.cssSelector(".chkAgree")).click();
        driver.findElement(By.xpath("//button")).click();
        		
	}
	// all the products needed to added to cart
	public static void addItems(WebDriver driver,String[] itemsNeeded) {
		
		
        int count =0;
        
		List<WebElement> products  = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) {
			
			String[] name = products.get(i).getText().split("-");
			String formattedName =name[0].trim();
			
			//convert array into array list for easy search
			//check whether name extracted is present in items needed list or not
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName)) {
				
				//click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				count++; 
				
				if(count == itemsNeeded.length) {
					break;
				}
			}
		}

	}

}
