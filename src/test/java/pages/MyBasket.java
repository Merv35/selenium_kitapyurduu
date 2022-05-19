package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

public class MyBasket {

	private static WebElement element=null;

	
	public static WebElement select_product_price_in_basket(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[contains(@class, 'old-price')]/strike"));
		return element;
	}
	
	public static void make_double_product(WebDriver driver) {
		
		Select amount = new Select(driver.findElement(By.id("497209443")));
		amount.selectByValue("2");
		

	}
	
	public static WebElement delete_product(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//span[contains(text(), 'Sil')])[1]//preceding::i[1]"));
		return element;
		

	}
	
	
	
}
