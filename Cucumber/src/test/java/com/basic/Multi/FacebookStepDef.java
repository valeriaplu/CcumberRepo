package com.basic.Multi;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStepDef {
	
WebDriver driver;
	
	@Given("^Utente deve trovarsi nella pagina di login$")
	public void utente_devi_aprire_un_homepage_di_facebook_e_validare_i_campi() {
		
		System.setProperty("webdriver.chrome.driver",
             "C:\\Users\\Bcsoft\\Desktop\\FDC\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
	}
	@When("^Utente inserisce email \"([^\"]*)\"$")
	
	public void utente_deve_inserire_email(String email) throws InterruptedException{
		
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(1000);
		
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
	@Then("^Chiusura Browser$") 
	public void Chiusura_Browser() {
		
		driver.quit();
		driver=null;
		
	}
	
}
