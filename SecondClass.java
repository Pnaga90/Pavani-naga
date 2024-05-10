package TestCases;

import org.testng.annotations.Test;

public class SecondClass {
	public void d() {
	System.out.println("I am in Second class method d");
	}
	
	@Test (groups = "smoketests" )
	
	public void e() {
	System.out.println("I am in second class method e");
	
}
}