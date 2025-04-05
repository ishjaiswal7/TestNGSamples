package com.testngsamples.Samples;

import org.testng.Assert;
import org.testng.annotations. Test;
// TestNG Asserts
public class Example8_2 {
	@Test
	public void test1() {
	 	//Assert.assertEquals(actual, expected); 
		Assert.assertEquals("MIT", "VIT"); 
	}

	@Test
	public void test2() {
		Assert.assertEquals("MIT", "VIT", "Test to check title");
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(true, false, "Test to check login credentials");
	}
	
	@Test
	public void test5() {
		Assert.assertTrue(true);
	}

	@Test
	public void test6() {
		Assert.assertTrue(false, "Test to check login credentials");
	} 
	
	@Test
	public void test() {
		Assert.assertFalse(false);
	}

	@Test
	public void test8() {
		Assert.assertFalse(true, "Test to check login credentials");
	}

}
