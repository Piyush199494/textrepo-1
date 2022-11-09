Feature: Create lead in Vtiger app

Background:
Given User is already logged in
And user logged in successfully with valid data
And click on navigation bar
And go to marketing and select leads

Scenario Outline: Create new lead with name as <firstName>
When click on Add Leads button and enter firstname as <firstName>,last as <lastName>, number as <PhoneNumber> and click on save button
And click on All lead link
Then Verify Lead is created with <lastName>
And close the Vtiger browser

Examples:
|firstName|lastName|PhoneNumber|
|QA       |Champak | 3245632   |

Scenario: Delete all Leads
When click on select all leads checkbox
And click on delete logo
And User will get a popup ,select yes
Then Verify that all leads are deleted
And close the Vtiger browser
