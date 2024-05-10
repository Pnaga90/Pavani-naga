package TestCases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import Coding.scientificCalculator;

public class junitTC_add {
	static scientificCalculator mycalc;
	
	@BeforeClass
	public static void doFirst() {
		scientificCalculator mycalc = new scientificCalculator();
		
	}
	
	@Test
	public void testAdd() {
	
		int actualResult=mycalc.add(10, 20);
		
		Assert.assertEquals(30, actualResult);
		
	}

	@Test
	public void testAddF() {
		
		float actualResultF = mycalc.scAddFloat(100.89F, 200.65F);
		
		Assert.assertEquals(10,actualResultF);
		
	}

}
