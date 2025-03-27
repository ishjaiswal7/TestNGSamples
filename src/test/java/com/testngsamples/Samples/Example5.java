package com.testngsamples.Samples;

import org.testng.annotations. Test;

// Invocation Method
public class Example5 {

	@Test(invocationCount = 10) 
	public void sample() { System.out.println("Test with invocation method"); }

	@Test
	public void sample1() { System.out.println("Test with normal method"); }
}
