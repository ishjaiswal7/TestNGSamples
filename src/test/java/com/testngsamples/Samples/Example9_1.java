package com.testngsamples.Samples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Parameterization in TestNg
public class Example9_1 {
	
	@Test
	@Parameters("Name")
	public void displayName(String name){ 
		System.out.println("Name is:" + name);
	}

}
