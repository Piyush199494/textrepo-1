Feature: Trying to search something in google

Scenario: Trying to search Selenium Interview questions in google
Given User has already on google search page
When user types 'Selenium Interview Questions' in search input field and press enter key
Then User Should be able to get result page with title having 'Selenium Interview Questions'
And close the browser
Scenario Outline: Trying to search <textToBeSearched> in Google
 Given User has already on google search page
 When user type<textToBeSearched> in search input field and press enter key
 Then User should able to get result page with title having <textToBeSearched> 
 And close the browser
 Examples:
 | textToBeSearched             |
 | Selenium Interview Questions |
 | Manual Testing Questions     |
 | API Testing question         |