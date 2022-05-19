package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchResultPage {

	private static WebElement element=null;
	
	public static WebElement get_search_result(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//span[contains(text(),'oyuncak')]"));
		element.getText();
		System.out.println("Your search result is under" + element + "category!");
		return element;
	}
	public static void check_search_result(WebDriver driver) {
		
		String element = driver.findElement(By.xpath("//*[@class=\"grid_7 omega\"]/div[1]")).getText();
		System.out.println("Your search is " + element);
		Assert.assertEquals("bilgisayar", element);
		
	}
	
	public static WebElement select_product_name(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[contains(@class, 'sc-1nx8ums-0 dyekHG')][2]/following::h2[1]"));
		return element;
		
	}
	
	public static WebElement select_product_price(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[contains(@class, 'sc-1nx8ums-0 dyekHG')][2]/following::span[2]"));
		return element;
		
	}

	
	public static WebElement add_product_to_basket(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[contains(@class, 'sc-1nx8ums-0 dyekHG')][3]"));
		return element;
	}
	
	public static WebElement goto_basket(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[contains(@title, 'Sepetim')]"));
		return element;
	}

	
	
	
	
	
}
