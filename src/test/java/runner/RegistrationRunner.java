package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


			@CucumberOptions(
					
					
					features = {"src\\test\\resources\\appFeature\\registration.feature"},
					
					glue = {"steps"},
					
					
					publish = true			
					
			)
			
			
			


public class RegistrationRunner extends AbstractTestNGCucumberTests{

}
