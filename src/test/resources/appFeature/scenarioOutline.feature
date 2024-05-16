Feature: SignUp Functionality
Scenario Outline: SignUp to Application
Given User is at SignUp page
When user enters the "<name>" in form
And user entes the age as <age>
And user confirms "<gendor>" button
Then User account gets created

Examples:

| name |age | gendor |
| Eder | 23 | male |
| Ram | 40 | male |
| Shubham | 28 | male |
| Shivani | 33 | female |
