package com.basic.Shared;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SharedStepDef {
	
	

	public SharedStepDef(SharedClass share) {
		driver=share.BeforeSetup();
		
	}

	
	
WebDriver driver;
 
	@Given("^Utente deve trovarsi nella pagina di login$")
	public void utente_devi_aprire_un_homepage_di_facebook_e_validare_i_campi() {
		
	
		driver.get("https://www.facebook.com/login/");
		
	}
	@When("^Utente inserisce email \"([^\"]*)\"$")
	
	public void utente_deve_inserire_email(String email) throws InterruptedException{
		
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(1000);
		
	}
	
	
	

}
