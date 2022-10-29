package mylearning.seleniumintro;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingTableUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2046171\\eclipse-workspace\\seleniumintro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelements in a list
		List<WebElement> elementList= driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture all element in original list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort the list using streams
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
       Assert.assertTrue(originalList.equals(sortedList));
       
       //getting the price of a particular item
       List<String> prices;
       do {
    	   List<WebElement> elements= driver.findElements(By.xpath("//tr/td[1]"));
        prices = elements.stream().filter(s->s.getText().contains("Rice")).
    		   map(s->getPriceVeggie(s)).collect(Collectors.toList());
       
       prices.forEach(s->System.out.println(s));
       //this is for pagination i.e. for if element not found on first page
       if(prices.size()<1) {
    	   driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
    	   
       }
		
       }while(prices.size()<1);

	}
      public static String getPriceVeggie(WebElement s) {
    	  
    	 String pricevalue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
    	  return pricevalue;
      }
}
