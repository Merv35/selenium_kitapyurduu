package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MainPage{


	private static WebElement element=null;
	
	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[contains(@aria-label, 'Keşfetmeye Bak')]"));
		return element;
	}

	public static WebElement button_search(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//span[contains(text(), 'BUL')]"));
		return element;
	}
}
