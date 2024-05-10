package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parametertestcases {

	@Parameters({ "FirstName" })

  @Test
  
 public void Parametertestcases1(String firstName) {
		System.out.println(firstName);
		
		Assert.assertEquals(true, true);
	
	
	}
	
	@Parameters({ "SecondName" })
	@	Test
  public void Parametertestcases2(String SecondName) {
	  
	System.out.println(SecondName); 
	
  Assert.assertEquals(true, false);
  }
}
	
	
	

