package TestCases;




import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HKPages.LandingPage;
import HKPages.LoginPage;
import utils.ExcelApiTest;
import utils.openChromeBrowser;

public class LoginPageTestCases2 {
  
	static WebDriver driver;
	static LoginPage lp;
	static LandingPage landingpage;
	boolean res;
	
	String xlFilePath = "d:\\Test.xlsx";
	String sheetName = "Sheet1";
	ExcelApiTest eat = null;
	
	@AfterClass
	public void closeDriver()
	{
		
		driver.quit();
	}
	@DataProvider(name="xldp")
	  
	  public    Object[][]userdata() throws Exception {
	    	Object[][] dataexcel = readfromexcel(xlFilePath, sheetName);
	        return dataexcel;
	    }
	@BeforeClass
	public void initDriver()
	{
		
		openChromeBrowser ob = new openChromeBrowser();
		driver = ob.openChrome();
		driver.get("https://the-internet.herokuapp.com/login");
		lp = new LoginPage(driver);
		landingpage = new LandingPage(driver);  	
	}
	
	
	@Test
  public void chkTitleOfLoginPage () {
	  
	 res= lp.chkTitle("The Internet");
	  
	Assert.assertEquals(true,res);  
  }
	@Test
	public void chkToSeeIfFooterIsThere ()
	{
		
		Assert.assertEquals(true, lp.chkPageFooter());
		
	}
	
	@Test
	public void chkToSeePasswordMasked()
	{
		Assert.assertEquals(true, lp.isPasswordMasked());
	}
	
	@Test (dataProvider="xldp")
		
	
	public void doLogin(String u, String p)


	{
		lp.fillUsername(u);
		lp.fillPassword(p);
		lp.clickLoginBtn();
		
		Assert.assertEquals(true,landingpage.isLoginSuccess());
		
	}
	
	@Test
	public void doLoginNegativeSecurity()
	{
		lp.fillUsername("tomsmith");
		lp.fillPassword("SuperSPassword!");
		lp.clickLoginBtn();
		
		Assert.assertEquals(false,landingpage.isLoginSuccess());
		
	}
	
	public Object[][] readfromexcel(String xlFilePath, String sheetName) throws Exception
	{
	    Object[][] excelData = null;
	    eat = new ExcelApiTest(xlFilePath);
	    int rows = eat.getRowCount(sheetName);
	    int columns = eat.getColumnCount(sheetName);
	             
	    excelData = new Object[rows-1][columns];
	     
	    for(int i=1; i<rows; i++)
	    {
	        for(int j=0; j<columns; j++)
	        {
	            excelData[i-1][j] = eat.getCellData(sheetName, j, i);
	        }
	         
	    }
	    return excelData;
	}

}
