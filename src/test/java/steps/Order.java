package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order {

	@Given("User should be logged into application")
	public void user_should_be_logged_intpo_application() {
	    System.out.println("Given Statement");
	}

	@When("User click on order button")
	public void user_click_on_order_button() {
	   System.out.println("Clicking on order button");
	}

	@Then("User redirects to Orders Page")
	public void user_redirects_to_orders_page() {
		System.out.println("Redirecting to order page");
	}

	@When("User click on current order button")
	public void user_click_on_current_order_button() {
		System.out.println("Clicking on current order button");
	}

	@Then("User should see the current order information")
	public void user_should_see_the_current_order_information() {
		System.out.println("Current Order information fetched");
	}

	@When("User click on past order button")
	public void user_click_on_past_order_button() {
		System.out.println("Clicking on past order button");
	}

	@Then("User should see the past order information")
	public void user_should_see_the_past_order_information() {
		System.out.println("Past Order information fetched");
	}

	@When("User click on cancelled order button")
	public void user_click_on_cancelled_order_button() {
		System.out.println("Clicking on cancelled order button");
	}

	@Then("User should see the cancelled order information")
	public void user_should_see_the_cancelled_order_information() {
		System.out.println("Cancelled Order information fetched");
	}



	
	
}
