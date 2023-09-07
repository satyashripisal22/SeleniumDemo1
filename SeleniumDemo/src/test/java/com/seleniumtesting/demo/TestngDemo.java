package com.seleniumtesting.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDemo {
	
	WebDriver driver;
	@BeforeSuite
	public void Setup() {
		System.out.println("I am Before Suite ");
		
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in Before Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in Before Class");
	}

	@BeforeMethod
    public void beforeMethod() {
	System.out.println("I am in Before Method");
}
	@Test
	@Parameters({"Url","Amount"})
	public void Calculator(String URL , String Amount) {
		System.out.println("I am in Calculator Test");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.id("eamount")).clear();
		driver.findElement(By.id("eamount")).sendKeys(Amount);
		
		Select UsdCurrency = new Select(driver.findElement(By.id("efrom")));
		UsdCurrency.selectByValue("USD");
		
		Select INDCurrency = new Select(driver.findElement(By.id("eto")));
		INDCurrency.selectByValue("INR");
		
		driver.findElement(By.xpath("//*[@id='standard']/tbody/tr[5]/td[2]/input[2]")).click();
		String Calculation = driver.findElement(By.xpath("//*[@id='content']/p[1]")).getText();
		System.out.println("Calculation = "+Calculation);
		
		
	}
	@Test
	public void supplier() {
		System.out.println("I am in Supplier test");
	}
	@AfterMethod
    public void afterMethod() {
	System.out.println("I am in After Method");
}
	@AfterClass
	public void afterClass() {
		System.out.println("I am in After Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("I am in After Test");
	}
	@AfterSuite
	public void TearDown() {
		System.out.println("I am After Suite");
	}
}
