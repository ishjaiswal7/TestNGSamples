package com.testngsamples.Samples;

import org.testng.annotations.Test;

// TestNG Groups
public class Example7_1_G2 {
	@Test(groups= {"login"})
	public void ParentLogin() { System.out.println("Parent Login"); } 
	
	@Test
	public void ParentDetails() { System.out.println("Parent Details"); }

}
