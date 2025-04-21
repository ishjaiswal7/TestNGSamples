package com.testngsamples.Samples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// TestNG Parameterization Using DataProviders
public class Example10_2 {
	@Test(dataProvider = "mydata") 
	public void Login(String user, String password) {
		System.out.println("Login Credentials"); 
		System.out.println(user); 
		System.out.println(password+"\n");
	}
	
	@DataProvider (name="mydata") 
	public Object[][] getData() {
		Object[][] data = new Object[3][2]; 
		data[0][0]="USER ONE"; 
		data[0][1]="VIT1@"; 
		data[1][0]="USER TWO"; 
		data[1][1]="VIT12#"; 
		data[2][0]="USER THREE"; 
		data[2][1]="VIT123#$";
		return data;
	}
		
}
