package com.basic.esempioMoltepliciScenari;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features= { "src/test/resources/com/basic/moltepliciScenariFeature/" },
        glue= {  "com/basic/esempioMoltepliciScenari/" 	},
        
		plugin= { "pretty", 
				   "html:target/cucumber-htmlreport",
				   "json:target/cucumber-report2.json",
				   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
				   
				
		   }
		
		
		
		
		)

public class RunMolteplici {

	
	
	
}
