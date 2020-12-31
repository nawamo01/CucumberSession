Feature: "Uber Car Types"

Background:
Given Customer open uber application
And Customer enters username and password
And Customer choose car type 

@smoke
Scenario: "Uber car type Sedan"
When Customer select Sedan car for ride
Then The pick up point is "Chennaione" And drop point is "Bangalore"
Then Customer pays 8000 

@Regression @smoke
Scenario: "Uber car type SUV"
When Customer select SUV car for ride
Then The pick up location is "Bangalore" And drop point is "Hyderabad"
Then Customer provide 6000 

@production
Scenario: "Uber car type mini"
When Customer select mini car for ride
Then The pick up is "Chennai" And drop  is "Mumbai"
Then Customer given 18000 