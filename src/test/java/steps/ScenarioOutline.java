package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {

	
	
	@Given("User is at SignUp page")
	public void user_is_at_sign_up_page() {
	   System.out.println("Given Statement");
	}

	@When("user enters the {string} in form")
	public void user_enters_the_in_form(String string) {
	  System.out.println("Entered name is : " + string );
	}

	@When("user entes the age as {int}")
	public void user_entes_the_age_as(Integer int1) {
		System.out.println("Entered age is : " + int1 );
	}

	@When("user confirms {string} button")
	public void user_confirms_button(String string) {
		System.out.println("selecting gendor is : " + string );
	}

	@Then("User account gets created")
	public void user_account_gets_created() {
		System.out.println("Then Statement");
	}



	
}
