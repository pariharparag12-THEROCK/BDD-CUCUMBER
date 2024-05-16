package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

				@CucumberOptions(
						
						
						features = {"src\\test\\resources\\appFeature\\profile.feature"},
						
						glue = {"steps", "hooks"},
						
						publish = true,
						
						plugin = {"pretty"},
						
						//tags = "(@sanity or @functional) and (not @regression)"
						
						/*
						 * [If we use tags in hooks class then we cannot use that tags here in runner]
						 */
						
						//tags ="@profile" 
						
						dryRun = true
						
						
			)


public class ProfileRunner extends AbstractTestNGCucumberTests{

}
