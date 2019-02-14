package Sample;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features= {"src/main/resources/Features/Demo/"},
		//glue= {"src/test/java/StepDef/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucmber-report.json"
				//"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
		}
		
		
		)
	

public class runMyFirstFeatureTest {
	
	
}
