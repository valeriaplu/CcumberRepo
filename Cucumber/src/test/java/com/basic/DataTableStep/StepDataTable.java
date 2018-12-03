package com.basic.DataTableStep;


import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDataTable {

WebDriver driver=null;

  

	@Given("^Utente deve trovarsi nella pagina di login$")
	public void utente_devi_aprire_un_homepage_di_facebook_e_validare_i_campi() {
		
		System.setProperty("webdriver.chrome.driver",
	             "C:\\Users\\Bcsoft\\Desktop\\FDC\\chromedriver_win32\\chromedriver.exe");
	   driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
	}
	@When("^Utente inserisce (.+) e (.+)$") 
	public void Utente_inserisce_password(String email, String password) throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1000);
		
	}
	@Then("^Utente controlla che il nome dell'utente sia presente$") 
	public void utent_controlla_che_email_dell_utente_sia_presente() throws InterruptedException {
		
		String emailActual=driver.findElement(By.id("email")).getAttribute("value");
		//Assert.assertEquals(email, emailActual);
		Thread.sleep(1000);
		
	}
	
	
	
	
	
}
