package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

		@CucumberOptions (
				
				features = {"src\\test\\resources\\appFeature\\loginWithData.feature"},
				
				glue = {"steps"},
				
				publish = true
				
		)


public class LoginWithDataRunner extends AbstractTestNGCucumberTests {

		
}
