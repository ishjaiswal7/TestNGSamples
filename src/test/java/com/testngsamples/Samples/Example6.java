package com.testngsamples.Samples;

import org.testng.annotations.Test;

// TestNG Dependencies Management
public class Example6 {

	@Test(enabled = false)
	public void highschool() {
		System.out.println("High School"); 
	}

	@Test(dependsOnMethods = "highschool")
	public void highersecondary() {
		System.out.println("Higher Secondary");
	} 
	
	@Test(dependsOnMethods = "highersecondary")
	public void college(){
		System.out.println("College");
	}
	
}
