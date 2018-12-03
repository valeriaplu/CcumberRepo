package com.basic.DataTableStep;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features= { "src/test/resources/com/basic/DataTable/" },
        glue= {  "com/basic/DataTableStep/" 	},
        
		plugin= { "pretty", 
				   "html:target/cucumber-htmlreport",
				   "json:target/cucumber-report.json",
				   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				   
				
		   }
		
		
		
		
		)
public class RunDataTable {

}
