package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

		@CucumberOptions (
				
				features = {"src\\test\\resources\\appFeature\\order.feature"},
				
				glue = {"steps"},
				
				publish = true
				
		)


public class OrderRunner extends AbstractTestNGCucumberTests {

		
}
