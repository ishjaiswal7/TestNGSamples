package com.testngsamples.Samples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Parameterization in TestNg
public class Example9_2 {
	
	@Test
	@Parameters ({"UserName", "Password"})
	public void sample1 (String name, String password) {
		System.out.println("The User Name is "+ name);
		System.out.println("The Password is " + password);
	}
}
