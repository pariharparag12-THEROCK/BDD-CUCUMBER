Feature: Order Information


Background:
Given User should be logged into application
When User click on order button
Then User redirects to Orders Page


Scenario: Fetched currently placed order information
When User click on current order button
Then User should see the current order information

Scenario: Fetched past order placed information
When User click on past order button
Then User should see the past order information


Scenario: Fetched cancelled order information
When User click on cancelled order button
Then User should see the cancelled order information