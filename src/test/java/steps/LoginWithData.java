package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// CLT + SHIFT + O ------> All import together

public class LoginWithData {

	@Given("I am at the landing page")
	public void i_am_at_the_landing_page() {
	    System.out.println("Given Statement");
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String username) {
	    System.out.println("Entering username is : " + username);
	}

	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String password) {
		 System.out.println("Entering password is : " + password);
	}

	@When("I click on Submit button")
	public void i_click_on_submit_button() {
		 System.out.println("Clicking on submit button ");
	}

	@Then("I should get logged into app")
	public void i_should_get_logged_into_app() {
		System.out.println("User logged in");
	}



	
	
	
	
	
}
