package uIFeatures;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {

	
	WebDriver driver;
	
	//HomePage hompage = new HomePage(driver);
	
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	
	
	@Given("user is at the amazonhome page")
	public void user_is_at_the_amazonhome_page() {
	   
		driver = DriverFactory.getDriver();
		driver.get("https://www.amazon.in/");	
		
		driver.navigate().refresh();
	}

	@Then("Pagetitle should contain {string}")
	public void pagetitle_should_contain(String string) {
	   
		String title =	homepage.fetchTitle();
		boolean	isPresent =	title.contains(string);
		
		//Assert.assertTrue(isPresent);
		
		Assert.assertEquals(isPresent, true);
	}

	@Then("Cart icon should get display")
	public void cart_icon_should_get_display() {
	  
		boolean isGettingDisplayed =	homepage.isCartDisplayed();
		
		Assert.assertEquals(isGettingDisplayed, true);
	}

	@When("user search {string} in text field")
	public void user_search_in_text_field(String string) {
		homepage.searchProduct(string);
	}

	@Then("user should see the mobiles")
	public void user_should_see_the_mobiles() {
	  
			String title =	driver.getTitle();
			boolean	isPresent =	title.contains("mobile");
			
			Assert.assertEquals(isPresent, true);
	}

	@When("user clicks on mobiles")
	public void user_clicks_on_mobiles() throws InterruptedException {
	    homepage.clickOnMobile();
	}

	@Then("mobile page should get opened")
	public void mobile_page_should_get_opened() {
	  
		String	titleOfPage =	homepage.naviToMobilePage();
		boolean isPresent =	titleOfPage.contains("Samsung");
		
		Assert.assertEquals(isPresent, true);
	}



	
	
	
}
