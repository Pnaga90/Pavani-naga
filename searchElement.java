package HKPages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


class searchElement {
	boolean result;
	static WebDriver driver;
	@Test
	public void testsearch() {
		
	driver = new ChromeDriver();
  driver.get("https://www.advantageonlineshopping.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 
 String srch = "mouse";
 driver.findElement(By.id("autoComplete")).sendKeys("mouse" +Keys.ENTER);

 
 try {
	 String items = driver.findElement(By.xpath("//*[contains(@class,\"ItemsCount\")]//parent::p")).getText();
	 System.out.println(items);
	 result = true;
 }
 catch (NoSuchElementException e) {
	System.out.print("no items found for:" + srch);
	
	result = false;
	
	 
 }
 
 Assert.assertEquals(true, result);
 
 }
 }