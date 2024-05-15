package Webdriver;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dev.failsafe.internal.util.Assert;
import utils.OpenChromeBrowser;


public class CheckTitleEbay {
	
	
	static WebDriver driver;
			
	private static final String ActualTitle = null;

	public static  void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	OpenChromeBrowser	 ob = new OpenChromeBrowser();
	driver = ob.openChrome();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	boolean ActualTitle = driver.getTitle() != null;
	String excepectedTitle = "Search Elements in online with Ebay.com";
	Assert.state(ActualTitle, excepectedTitle, args);
	
	
	TakesScreenshot webdriver = null;
	
	 TakesScreenshot scrShot =((TakesScreenshot)webdriver);
    
    
    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    String fileWithPath = null;
  //Move image file to new destination
  File DestFile=new File(fileWithPath);
  
   //Move image file to new destination
     File DestFile1=new File(fileWithPath);
  //Copy file at destination
    FileUtils.copyFile(SrcFile, DestFile1);
	
    
	}

	}








	
	
		
	
	
	
	