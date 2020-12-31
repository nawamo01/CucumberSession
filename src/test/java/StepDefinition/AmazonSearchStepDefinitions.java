package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchStepDefinitions {

	@Given("Login and search the product in Amazon")
	public void login_and_search_the_product_in_amazon() {
	  System.out.println("Amazon Page get into Search Page");
	}

	@When("Once Amazon get into Search Page")
	public void once_amazon_get_into_search_page() {
		System.out.println("Amazon Search Page is available to search for Apple Phones");
	}

	@Then("Search the {string} for below {int}")
	public void search_the_for_below(String phone, Integer price) {
		System.out.println("51 products available on your selected brand " + phone +" for below cost of Rs." +price);
	}
	
	
}
