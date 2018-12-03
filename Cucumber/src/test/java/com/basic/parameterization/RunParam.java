package com.basic.parameterization;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features= { "src/test/resources/com/basic/parameterizationFeature/" },
        glue= {  "com/basic/parameterization/" 	},
        
		plugin= { "pretty", 
				   "html:target/cucumber-htmlreport",
				   "json:target/cucumber-report5.json",
				   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
				   
				
		   }
		
		
		
		
		)

public class RunParam {

	
	
	
}
