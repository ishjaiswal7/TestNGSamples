package com.testngsamples.Samples;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// TestNG Listeners
public class Example11 implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Execution is going to Start"); 
	}
	
	public void onTestSuccess(ITestResult result) { 
		System.out.println("Test Case Execution is Passed"); 
	}

	public void onTestFailure (ITestResult result) { 
		System.out.println("Test Case Execution is Failed");
	}

	public void onTestSkipped(ITestResult result) { 
		System.out.println("Test Case Execution is Skipped"); 
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Case Failed Percentage Within Range"); 
	}

	public void onStart(ITestContext context) { 
		System.out.println("Before Everything"); 
	}

	public void onFinish (ITestContext context) { 
		System.out.println("After Everything"); 
	}

}
