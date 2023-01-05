Feature: This feature is for login functionality





@Login
Scenario: Verify user can login with valid credentials
Given MetaLaunch "<URL>"
Then Click Login Link
Then Enter Username and Enter Password and Click Login button
Then Verify user can login with valid credentials