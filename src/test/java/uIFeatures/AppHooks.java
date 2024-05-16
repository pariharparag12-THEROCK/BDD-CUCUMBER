package uIFeatures;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;

public class AppHooks {

	
	WebDriver driver;
	
	
	@Before
	public void launchBrowser() {
		
		DriverFactory df = new DriverFactory();
		
		driver =	df.initBrowser("chrome");
		
		driver.manage().window().maximize();
	}
	
	
	@After (order = 2)
	public void tearDown(Scenario scenario) {
		
			boolean	hasFailed =	scenario.isFailed();
			
			if (hasFailed == true) {
				
					String scenarioname = scenario.getName();
												
					String	scenarioNameWithoutSpace =	scenarioname.replace(" ", "_");
					
					TakesScreenshot	ts	= (TakesScreenshot)driver;
					
					byte source []	= ts.getScreenshotAs(OutputType.BYTES);
					
					// Cucumber does not support File type, it supports bytes so we use data type as byte array
					
					scenario.attach(source, "image/png", scenarioNameWithoutSpace);
					
					
			}
			
			
		
			
	}
	
	
	@After (order = 1)
	public void closingBrowser() {
		driver.quit();
	}
}
