package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LandingPage;

public class TestBase implements Setup {

	WebDriver driver=null;
	
	public WebDriver initilizeDriver() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 return driver;
	}
	
	
	public LandingPage enterURL(String url) {
		driver.get(url);
		return new LandingPage(driver);
	}
	
}
