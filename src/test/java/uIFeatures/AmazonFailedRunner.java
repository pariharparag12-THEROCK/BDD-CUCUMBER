package uIFeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


					@CucumberOptions(
							
							
						//features = {"src\\test\\resources\\UIFeature\\homepage.feature"},
							
						features = {"@target/failedRerun.txt"},	
						
						glue = {"uIFeatures"},
						
						publish = true,
									
						plugin = {"pretty", "html:target/cucumber-reports/AmazonTestResults.html", "rerun:target/failedRerun.txt"}
				)
					
				
public class AmazonFailedRunner extends AbstractTestNGCucumberTests{

}
