package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeBrowser {
	
	WebDriver driver;
	
	public WebDriver openChrome() {
	//System.setProperty("webdriver.chrome.driver","file:/C:/Users/Administrator/Downloads/Htmlh.html");
	
		
		

		ChromeOptions options = new ChromeOptions();
	    //options.setBrowserVersion("124");
	    driver = new ChromeDriver();
	    return driver;
	    
		}


		
		
		
	}

	

	
