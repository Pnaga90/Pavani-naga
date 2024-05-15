package Webdriver;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class checkBoxExample {
	    static WebDriver driver;
		public static void main(String[] args) {
			driver = new ChromeDriver();
			
			// Put an Implicit wait, 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Launch the URL
			driver.get("file:///D:/ustpage.html");
			
		    boolean isRemembermeSelected= driver.findElement(By.name("rememberme")).isSelected();
			System.out.println(isRemembermeSelected);
	  }
	}



