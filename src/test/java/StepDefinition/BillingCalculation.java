package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingCalculation {

	double BillAmount;
	double TaxAmount;
	double FinalAmount;
	
	@Given("User on billing page")
	public void user_on_billing_page() {
			System.out.println("User on Billing Page");
	    
	}
	@When("User enters {int} and {double}")
	public void User_enters_and(Integer BAmount, Double TAmount) {
		BillAmount = BAmount;
		TaxAmount = TAmount;
		
		
	}

	
	@Then("User click on Calculate button")
	public void user_click_on_calculate_button() {
	    System.out.println("User Clicks Calculate Button");
	    
	}

	@Then("System provides {double}")
	public void system_provides(Double double1) {
	    FinalAmount = BillAmount + TaxAmount;
	    System.out.println("Bill Amount : " +BillAmount + " Tax Amount : " +TaxAmount +" Final Amount : "+FinalAmount);
	}
	
	
	
}
