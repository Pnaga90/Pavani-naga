package exelops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamplE {

	
	
        public static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		
			
			driver = new ChromeDriver();
			driver.get("file:///C:/Users/Administrator/Downloads/alerts.html");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);				
		    driver.findElement(By.id("btnconfirm")).click();
			driver.switchTo().alert().dismiss();
			Thread.sleep(500);
			driver.findElement(By.id("btnprompt"));
			driver.switchTo().alert().accept();
			Thread.sleep(500);
			driver.findElement(By.id("btnalert"));
			driver.switchTo().alert().sendKeys("pavani");
			driver.switchTo().alert().accept();
			String txt1 = driver.findElement(By.id("output")).getText();
			System.out.println(txt1);
			
		}


			
			
		

	}



