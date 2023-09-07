package com.selenium.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+ " In Listener Class = Test started successfully");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName()+ " In Listener Class = Test PASS");
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println(result.getName()+ " In Listener Class = Test FAIL");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(result.getName() + " In Listener Class = Test SKIP");
	}

	
}
