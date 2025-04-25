package com.testngsamples.Samples;

import org.testng.annotations.Test;

// TestNG Parameterization Using DataProviders
public class Example10_3 {
	
	@Test(dataProvider="mydata", dataProviderClass= Example10_2.class) 
	public void Login(String user, String password) {
		System.out.println("Login Credentials");
		System.out.println(user);
		System.out.println(password+"\n");
	}
}
