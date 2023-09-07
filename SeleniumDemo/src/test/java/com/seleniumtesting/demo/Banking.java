package com.seleniumtesting.demo;

import org.testng.annotations.Test;

public class Banking {

	@Test
	public void Banking_Car_Loan() {
		System.out.println("I'm in CarLoan Section");
	}
	@Test(groups= {"Smoke"})
	public void Banking_Personal_Loan() {
		System.out.println("I'm in PersonalLoan Section");
	}
	@Test(groups= {"Smoke"})
	public void Banking_Home_Loan() {
		System.out.println("I'm in HomeLoan Section");
	}
	@Test
    public void Banking_Bike_Loan() {
    	System.out.println("I'm in BikeLoan Section");
	}
	@Test
    public void SignIn() {
    	System.out.println("I'm in SignIn Section");
    }
}
