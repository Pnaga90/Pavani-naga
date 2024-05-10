package TestCases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import Coding.car;
import Coding.electricCar;

public class testHonda {

	public static electricCar honda;
	public boolean result;
	
	@BeforeClass
	public static void doFirst()
	{
		honda = new electricCar();
		
		//honda.colour="Red";
     	//honda.height=100;
	
		System.out.println("Executing first");
	}
	
	@Test
	public void testStart() {
		//instantiate the class
		
		boolean started= honda.start();
		
		Assert.assertEquals(true, started);
	
	}
	@Test
	public void testColurOfHonda() {
		
		
		//ternary operator-short hand for if else condition	

		honda.setColour("Blue");
		System.out.println(honda.getColour());
		
		result=(honda.getColour()=="Blue") ? (result=true):(result=false);

		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testElectricCarStart()
	{
		result=(honda.autoSteer()==true) ? (result=true):(result=false);

		Assert.assertEquals(true, result);
		
	}
	
	
	
}
