package com.basic.FirstFeatureFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FirstStepDef {
	
	WebDriver driver;
	
	@Given("^Utente deve trovarsi nella pagina di login$")
	public void utente_devi_aprire_un_homepage_di_facebook_e_validare_i_campi() {
		
		System.setProperty("webdriver.chrome.driver",
             "C:\\Users\\Bcsoft\\Desktop\\FDC\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@When("^Utente deve inserire il nome$")
	
	public void utente_deve_inserire_il_nome(){
		
		driver.findElement(By.id("email")).sendKeys("Valeria");
		
		
	}
	@Then("^Utente controlla che il nome dell utente sia presente$") 
	public void utent_controlla_che_il_nome_dell_utente_sia_presente() {
		
		String usernameActual=driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals("Valeria", usernameActual);
		
	}
	
}
