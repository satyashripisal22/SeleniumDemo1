package com.selenium.iframedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("moneyiframe");
		
		List<WebElement>iframelist = driver.findElements(By.tagName("iframe"));
		int count = iframelist.size();
		
		for(int i=0;i<count;i++) {
			String text = iframelist.get(i).getText();
			Thread.sleep(1000);
			System.out.println(text);
		}
		
	}
}
