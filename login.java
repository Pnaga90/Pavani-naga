package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class login {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws Exception {
		
			  
			OpenChromeBrowser ob = new OpenChromeBrowser();
			
			driver =  ob.openChrome();
			
			driver.get("https://the-internet.herokuapp.com/login");
			
			driver.findElement(By.id("username")).sendKeys("tomsmith");
			driver.findElement(By.id("password")).sendKeys("SuperSecord!");
		
			driver.findElement(By.cssSelector("#login > button")).click();
			
			
				
				try {
					driver.findElement(By.partialLinkText("Logout"));
				}
				catch(NoSuchElementException e)
				{
					System.out.println("Login Failed.");
					CaptureScreenaShot cs = new CaptureScreenaShot();
				
						cs.takeSnapShot(driver,  "C:\\Users\\Administrator\\Desktop/pavani.jpg");
					
					
						}
						
					}
				}
			
	
	
					
	

	
