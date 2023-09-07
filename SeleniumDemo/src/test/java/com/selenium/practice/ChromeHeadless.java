package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless {

	@Test
	public void chromeHeadless() {
		//WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("headless");
		WebDriver driver = new ChromeDriver(co);
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
	}
}
