Feature: Login to application with data
Scenario: Login with correct credentials
Given I am at the landing page
When I enter the username as "testusername"
And I enter the password as "Test@1234"
And I click on Submit button
Then I should get logged into app