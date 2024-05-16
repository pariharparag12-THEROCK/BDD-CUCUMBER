Feature: HomePage Fuctionality

Scenario: Validate Title of Page
Given user is at the amazonhome page
Then Pagetitle should contain "Shopping"

Scenario: Validate Cart icon
Given user is at the amazonhome page
Then Cart icon should get display


Scenario: Validate Search Mobile
Given user is at the amazonhome page
When user search "mobile" in text field
Then user should see the mobiles
When user clicks on mobiles
Then mobile page should get opened