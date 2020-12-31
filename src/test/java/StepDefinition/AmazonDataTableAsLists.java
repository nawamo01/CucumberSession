package StepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonDataTableAsLists {

	@Given("user logged into Amazon")
	public void user_logged_into_amazon() {

		System.out.println("User Logged into Amazon Website");
	}

	@When("user on Registration Page")
	public void user_on_registration_page() {
		System.out.println("User on Registration Page");
	}

	@Then("user update the information")
	public void user_update_the_information(DataTable dataTable) {
	    List<List<String>> userlist = dataTable.asLists(String.class);
	    
	    for(List<String> e: userlist) {
	    	System.out.println(e);
	    }
	}
	
	@Then("user update the information with columns")
	public void user_update_the_information_with_columns(DataTable dataTable) {
	    List<Map<String,String>> usermap = dataTable.asMaps(String.class,String.class);
		System.out.println(usermap);
	}

	@Then("user registration successful")
	public void user_registration_successful() {
	    System.out.println("User Registration Successful");
	}

	
}
