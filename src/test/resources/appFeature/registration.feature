Feature: Opening bank account
Scenario: Opening an bank account of nominee
Given User should be at accounts page
When user enters the following data
| Erin | Smith | erin.smith@gmail.com | 8907654325 |
| robert | Jackson | robert.jackson@gmail.com | 623712782378| 
And User clicks on submit button
Then User should see the confirmation