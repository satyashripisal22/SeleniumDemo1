package com.selenium.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Websites {

	
	@Test
	public void Amazon() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
	}
	
	@Test
	public void Google() {
   
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		String actual =driver.getTitle();
		String expected = "Google1";
		Assert.assertEquals(actual, expected);
	}
}
