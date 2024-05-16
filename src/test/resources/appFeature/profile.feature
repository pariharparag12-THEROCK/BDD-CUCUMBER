
@profile
Feature: Profile Functionality

@sanity
Scenario: Verification of Add Profile
Given User is at the Homepage
When User clicks on Add button
And User enters the details
Then Profile should get added

@regression
Scenario: Verification of Update profile
Given User is at the Homepage
When User clicks Update button
And User edit the details
Then Profile should get updated 

@functional @sanity @regression
Scenario: Verification od Delete profile
Given User is at Homepage
When User clicks on delete button
Then Profile should get deleted