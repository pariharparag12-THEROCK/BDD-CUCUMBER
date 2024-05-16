Feature: Login Functionality

Scenario: login to Application
Given I am at login page
When I enter username
And I enter password
And I Click on login button
Then I should get logged into application


Scenario: validate Title
Given I am at login page
Then I should see the title