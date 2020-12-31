package StepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberTraiffplan {
	
	@Given("User enter into uber application")
	public void user_enter_into_uber_application() {
		System.out.println("Procedure 1");
	    
	}

	@When("Search for a Sedan car")
	public void search_for_a_sedan_car() {
		System.out.println("Procedure 2");
	    
	}

	@When("Customer select the Pick and drop location")
	public void customer_select_the_pick_and_drop_location() {
		System.out.println("Procedure 3");
	    
	}

	@Then("The pick up location is {string} And drop location is {string}")
	public void the_pick_up_location_is_and_drop_location_is(String Pickup, String drop) {
		String pickpoint = Pickup;
		String droppoint = drop;
		System.out.println("Procedure 4"+"From "+ pickpoint+" To " +droppoint);
	    
	}

	@Then("Uber starts the trip")
	public void uber_starts_the_trip() {
		System.out.println("Procedure 5");
	    
	}

	@Then("Uber Ends the trip")
	public void uber_ends_the_trip() {
		System.out.println("Procedure 6");
	    
	}

	@Then("Customer pays {int} Rupees for this trip")
	public void customer_pays_rupees_for_this_trip(Integer money) {
		
		int paid = money;
		System.out.println("Procedure 7");
	    Assert.assertEquals("1000", paid, "Payment not matched");
	    
	}

	@Then("Customer should not select Uber Money")
	public void customer_should_not_select_uber_money() {
		System.out.println("Procedure 8");
	    
	}


}
