package com.basic.Shared;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {

	WebDriver driver;
	
	
	
	@Before
  	public WebDriver BeforeSetup() {
  		
		if(driver==null) {
  		System.setProperty("webdriver.chrome.driver",
  	             "C:\\Users\\Bcsoft\\Desktop\\FDC\\chromedriver_win32\\chromedriver.exe");
  			driver= new ChromeDriver();
		}
		
		return driver;
  		
  	}
	
	

	@After
	public void Chiusura_Browser() {
		
		driver.quit();
		driver=null;
		
	}
	
	
	
	
	
}
