Feature: To verify the login functionality of application

Scenario Outline: Check the user login with <Flow> user
Given User is on actitime login page
When User Enters username as <username> in the username field
And user enters password as <password> in the password field
And user clicks on login button
Then User should get page title as <title>
And close the actiTime browser
Examples:
|Flow|username|password|title|
|Valid|admin|manaager|actiTime - Enter Time-Track|
|invalid|admin|""|actiTime - Login|
|invalid|""|manager|actiTime - Login|
