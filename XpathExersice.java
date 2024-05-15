package exelops;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExersice {
	

	static ChromeDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to open browser
		
		 driver = new ChromeDriver();
		
		//to maximise browser
		((WebDriver) driver).manage().window().maximize();
		
	//to open Website with multiple windows
		((WebDriver) driver).get("https://www.redbus.com/");
		
		

	}

}
