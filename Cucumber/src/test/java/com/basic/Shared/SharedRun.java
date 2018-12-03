package com.basic.Shared;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		
		
		features= { "src/test/resources/com/basic/sharedFeature/" },
        glue= {  "com/basic/Shared/" 	},
       
        
		plugin= { "pretty", 
				   "html:target/cucumber-htmlreport",
				   "json:target/cucumber-report6.json",
				   "junit:target/cukes.xml",
				   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"
				   
				
		   }
		
		
		
		
		)

public class SharedRun {

}
