Feature: "Uber traiff plan"

Scenario: "Uber car Sedan"
Given User enter into uber application 
When Search for a Sedan car
And Customer select the Pick and drop location
Then The pick up location is "Chennai" And drop location is "Bangalore"
And Uber starts the trip
And Uber Ends the trip
Then Customer pays 7000 Rupees for this trip
But Customer should not select Uber Money

