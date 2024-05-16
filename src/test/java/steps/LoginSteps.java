package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given ("I am at login page")
	public void goToLoginPage() {
		System.out.println("Given Statement");
	}
	
	@When("I enter username")
	public void sendUsername() {
		System.out.println("entering username");
	}


	@When("I enter password")
	public void sendPassword() {
		System.out.println("entering password");
	}
	
	@When("I Click on login button")
	public void loginToApp() {
		System.out.println("clicking on login button");
	}
	
	
	@Then ("I should get logged into application")
	public void validateLogin() {
		System.out.println("Validating login");
	}
	
	
	
	
	@Then ("I should see the title")
	public void validateTitle() {
		System.out.println("I should see the title");
	}
	
}
