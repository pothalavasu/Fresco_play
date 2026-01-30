Feature: to show how tags work
@Smoke
Scenario Outline: Sample1
Given browser is open
And user is on login feature 
When user enters <username> and <password>
Then user is navigated to home page

@run
Scenario Outline: Sample2
Given browser is open
And user is on login feature 
When user enters <username> and <password>
Then user is navigated to home page

@run
Scenario Outline: Sample3
Given browser is open
And user is on login feature 
When user enters <username> and <password>
Then user is navigated to home page