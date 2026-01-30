Feature: Trest login functionality

Scenario Outline: check login is successful with the browser
Given chrome browser is open
And user is on login page 
When user enters <username> and <password>
Then user is navigated to home page 

Examples:
| username|password|
| vasu|1234|
| harika|46463|
| kumari|45433|

