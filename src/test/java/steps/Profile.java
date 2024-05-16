package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Profile {

	@Given("User is at the Homepage")
	public void user_is_at_the_homepage() {
	   System.out.println("Given Statement");
	}

	@When("User clicks on Add button")
	public void user_clicks_on_add_button() {
	    System.out.println("Clicking on Add button");
	}

	@When("User enters the details")
	public void user_enters_the_details() {
	   System.out.println("Entering details");
	}

	@Then("Profile should get added")
	public void profile_should_get_added() {
	    System.out.println("Profile has been added");
	}

	@When("User clicks Update button")
	public void user_clicks_update_button() {
	    System.out.println("Clicking on update button");
	}

	@When("User edit the details")
	public void user_edit_the_details() {
	    System.out.println("Editing details");
	}

	@Then("Profile should get updated")
	public void profile_should_get_updated() {
	   System.out.println("Profile has been updated");
	}

	@Given("User is at Homepage")
	public void user_is_at_homepage() {
	    System.out.println("Given statement");
	}

	@When("User clicks on delete button")
	public void user_clicks_on_delete_button() {
	    System.out.println("clicking on delete button");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
	    System.out.println("Profile has been deleted");
	}








}
