package com.seleniumtesting.demo;

import org.testng.annotations.Test;

public class BankingAccounts {

	@Test
	public void CurrntAccount() {
		System.out.println("I'm in Current Account Section");
	}
	@Test(groups= {"Smoke"})
    public void SavingAccount() {
		System.out.println("I'm in Saving Account Section");
	}
	@Test(groups= {"Smoke"})
    public void SalaryAccount() {
		System.out.println("I'm in Salary Account Section");
	}
	@Test
    public void FD_Account() {
		System.out.println("I'm in FD Account Section");
	}
}
