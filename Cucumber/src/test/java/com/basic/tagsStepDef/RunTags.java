package com.basic.tagsStepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	    tags=    
	            
	             {"@Smoke", "@Regression" }, // and condition
	           
	    	  
	    	  
		
		features= { "src/test/resources/com/basic/tagsFeature/" },
        glue= {  "com/basic/tagsStepDef/" 	},
        
		plugin= { "pretty", 
				   "html:target/cucumber-htmlreport",
				   "json:target/cucumber-report7.json",
				   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"
				   
				
		   }
		
		
		
		
		)
public class RunTags {

}
