package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.OpenChromeBrowser;

public class AdvpHomepagetestcases{

static WebDriver driver;
boolean res;
static AdvpHomepagetestcases advhp;

@AfterClass
public void CloseDriver()
{
	//driver.quit();
}


@BeforeClass
public void initDriver()
{
	OpenChromeBrowser ob = new OpenChromeBrowser();
	driver = ob.openChrome();
	driver.get("https://www.advantageonlineshopping.com/#/");
	
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    advhp = new AdvpHomepagetestcases();
	
}

@Test 
public void clickSearchLens()
{
	advhp.clickSearchLens();
}


@Test (dependsOnMethods = "clickSearchLens" )
public void checkSearchBoxIsPresent()
{
	AssertJUnit.assertEquals(true, advhp.checkSearchBoxIsPresent());
}

@Test (dependsOnMethods = "checkSearchBoxIsPresent" )
public void enterSearchWord()
{
	advhp.enterSearch("mouse");
}


@Test (dependsOnMethods = "enterSearchWord" )
public void checkSearchResults()
{
	AssertJUnit.assertEquals(true, advhp.checkSearchResults());
}
}

//driver.findElement(By.id("autoComplete")).sendKeys(srch + Keys.ENTER);

    
