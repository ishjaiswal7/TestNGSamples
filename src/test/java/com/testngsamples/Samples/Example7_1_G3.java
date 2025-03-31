package com.testngsamples.Samples;

import org.testng.annotations.Test;

//TestNG Groups
public class Example7_1_G3 {
	
	@Test(groups = {"login"})
	public void StudentLogin() { System.out.println("Student Login"); }

	@Test
	public void StudentDetails() {
		System.out.println("Student Details");
	} 
}
