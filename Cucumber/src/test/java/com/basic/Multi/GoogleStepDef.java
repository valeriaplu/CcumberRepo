package com.basic.Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {

     WebDriver driver;
	
	@Given("^Utente deve trovarsi nella pagina$") 
	public void Utente_deve_trovarsi_nella_pagina_Google() {
		
		System.setProperty("webdriver.chrome.driver",
	             "C:\\Users\\Bcsoft\\Desktop\\FDC\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2F"
			+ "mail.google.com"
	    	+ "%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	}
	@When("^Utente inserisce nel campo una stringa$") 
	public void Utente_inserisce_nel_campo_una_stringa() throws InterruptedException {

		//driver.findElement(By.id("yDmH0d")).click();
		driver.findElement(By.id("identifierId")).sendKeys("ciao");
		Thread.sleep(1000);
	
		
	}
}
