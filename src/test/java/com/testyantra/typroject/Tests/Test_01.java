package com.testyantra.typroject.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_01 {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String title = driver.getTitle();
		Reporter.log(title,true);
		System.out.println("Changes 1");
		driver.close();
		
		
	}

}