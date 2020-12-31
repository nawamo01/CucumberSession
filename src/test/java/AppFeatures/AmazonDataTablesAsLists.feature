Feature: "Amazon Registration Form"

Scenario: "New User Registrations"
Given user logged into Amazon
When user on Registration Page
Then user update the information
	| Nawaz | nawaz@gmail.com | 999999 | India  |
	| TOM   | tom@gmail.com   | 888888 | London |
	| Jessi | jessi@yahoo.com | 555555 | France |
Then user registration successful

Scenario: "New User Registrations with columns"
Given user logged into Amazon
When user on Registration Page
Then user update the information with columns
	| FirstName | Email           | Phone  | Country  |
	| Nawaz     | nawaz@gmail.com | 999999 | India    |
	| TOM       | tom@gmail.com   | 888888 | London   |
	| Jessi     | jessi@yahoo.com | 555555 | France   |
Then user registration successful