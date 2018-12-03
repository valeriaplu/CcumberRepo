package com.basic.Shared;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;

public class SharedStepDef2 {

	WebDriver driver;
	
	
	public SharedStepDef2(SharedClass share) {
		driver=share.BeforeSetup();
		
	}
	
   @Then("^Utente controlla che \"([^\"]*)\" dell'utente sia presente$") 
	public void utent_controlla_che_email_dell_utente_sia_presente(String email) throws InterruptedException {
		
		String emailActual=driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals(email, emailActual);
		Thread.sleep(1000);
		
	}
	@And("^Utente inserisce password \"([^\"]*)\"$") 
	public void Utente_inserisce_password(String password) throws InterruptedException {
		
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1000);
		
	}
	@Then("^Campo User Mobile dovrebbe essere vuoto$") 
	public void Campo_User_Mobile_dovrebbe_essere_vuoto() throws InterruptedException {
		
		//
		
		
	}
}
