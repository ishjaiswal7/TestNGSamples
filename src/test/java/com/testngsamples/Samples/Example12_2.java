package com.testngsamples.Samples;

import org.testng.annotations.Test;

// Parallel Test Execution in TestNG
public class Example12_2 {
	
	@Test
	public void ParentLogin() {
		System.out.println("Parent Login");
	}

	@Test
	public void ParentDetails() {
		System.out.println("Parent Details");
	}

}
