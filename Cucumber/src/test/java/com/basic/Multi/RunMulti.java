package com.basic.Multi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			features= { "src/test/resources/com/basic/MultiFeature/" },
	        glue= {  "com/basic/Multi/" 	},
	        
			plugin= { "pretty", 
					   "html:target/cucumber-htmlreport",
					   "json:target/cucumber-report4.json",
					   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
					   
					
			   }
			
			
			
			
			)

public class RunMulti {
}
