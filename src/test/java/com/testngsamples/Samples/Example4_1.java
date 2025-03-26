package com.testngsamples.Samples;

import org.testng.annotations.Test;

//How to Set Test Priority in TestNG
//Drive Car Example
public class Example4_1 {
	
	@Test(priority = 0)
	public void startTheCar() { System.out.println("Start the Car"); }

	@Test(priority = 1)
	public void shiftFirstGear() { System.out.println("First Gear"); }

	@Test(priority = 2)
	public void shiftSecondGear() { System.out.println("Second Gear"); }
	
	@Test(priority = 3)
	public void shiftThirdGear() { System.out.println("Third Gear"); } 
	
	@Test(priority=4)
	public void shiftFourthGear() { System.out.println("Fourth Gear"); }

}

	