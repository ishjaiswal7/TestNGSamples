package com.testngsamples.Samples;

import org.testng.Assert;

import org.testng.annotations. Test;

// TestNG Asserts
// Assertion Example 
public class Example8_1 {

	String name = "VIT";

	@Test
	public void checkEqual() {
		
	/*if(name.equals("VIT")) {
		System.out.println("Name is Equal");
	} else { System.out.println("Name is NOT Equal"); }
	*/
	Assert.assertEquals(name, "VIT");

	}
	
}
