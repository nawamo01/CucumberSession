@All
Feature: "Calculate Billing Amount"

@Smoke @All
Scenario Outline: "Billing Calculation"
Given User on billing page
When User enters <B-Amount> and <T-Amount>
Then User click on Calculate button
And System provides <F-Amount>

Examples: 	
		| B-Amount	| T-Amount	| F-Amount	|
		|  100      |  20.5       |  120.5      |
		|  200      |  40.5       |  240.5      |
		|  500      |  50.5       |  550.5      |