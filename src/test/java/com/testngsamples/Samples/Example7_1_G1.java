package com.testngsamples.Samples;

import org.testng.annotations.Test;

// TestNG Groups
public class Example7_1_G1 {
	@Test(groups= {"login"}) 
	public void FacultyLogin() { System.out.println("Facuity Login"); } 
	
	@Test
	public void FacultyDetails() { System.out.println("Faculty Details"); }
	
}
