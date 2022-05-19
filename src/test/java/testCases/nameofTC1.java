package testCases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.Assert;
//import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
//import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;

import pages.MainPage;
import pages.MyBasket;
import pages.SearchResultPage;


public class nameofTC1 extends Common{

	@Test
	public static void mainPageSearch() {

		System.out.println("Main page of GittiGidiyor is opening");
		driver.get("https://www.gittigidiyor.com");
		//Assert.assertTrue(false);
		
		
		MainPage.textbox_search(driver).sendKeys("Bilgisayar");
		
		MainPage.button_search(driver).click();
				
	}	
	
	@Test
	public static void afterOpenedSearchResultPageCheck() {

		SearchResultPage.get_search_result(driver);

		SearchResultPage.check_search_result(driver);		
		
	}
		
	
	@Test
	public static void writeToTxt() throws IOException {
		
		String name = SearchResultPage.select_product_name(driver).getText();
		System.out.println("Your product's name is " + name);
		
		String priceI = SearchResultPage.select_product_price(driver).getText();
		System.out.println("Your product's price is " + priceI);
		
		File file = new File("C:\\Users\\beyza.aydin\\eclipse-workspace\\TSNMWebUI\\productInfoAndPrice.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write(name);
		writer.newLine();
		writer.write(priceI);
		System.out.println("Product datas are printed");
		writer.close();
	}
	
	@Test
	public static void addBasket() {

		SearchResultPage.add_product_to_basket(driver).click();
		
	}
	
	@Test
	public static void productPriceCheck() {

		
		String priceI = SearchResultPage.select_product_price(driver).getText();
		System.out.println("your selected product price is " + priceI);
		SearchResultPage.goto_basket(driver).click();
		String price = MyBasket.select_product_price_in_basket(driver).getText();
		System.out.println("in the basket your product's price is " + price);
		Assert.assertEquals(priceI, price);
		
	}
	
	@Test
	public static void makeDoubleProductAndCheck() {

		MyBasket.make_double_product(driver);

			
	}
	
	@Test
	public static void deleteProductAndCheck() {

		MyBasket.delete_product(driver).click();

		
		
	}
	
	
	
}
