package uIFeatures;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import qa.DriverFactory;

public class ProductSteps {
			
	
	ProductPage productpage = new ProductPage(DriverFactory.getDriver());
	
	
	@When("user clicks on cart icon")
	public void user_clicks_on_cart_icon() {
		productpage.clickOnCartIcon();
	}

	@When("useSignInButr clicks on signIn button")
	public void user_clicks_on_sign_in_button() {
		productpage.clickOnCartIcon();
	}

	@Then("user should be navigated to signIn window")
	public void user_should_be_navigated_to_sign_in_window() {
	
		String title =	productpage.naviToSignInPopUp();
		boolean isPresent =	title.contains("Amazon Sign");
		
		Assert.assertEquals(isPresent, true);
	}



}
