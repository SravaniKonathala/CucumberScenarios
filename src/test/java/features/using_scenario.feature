Feature: Working on scenario functionality

Scenario: Testing the Login functionality of web application

Given I launch the browser
And I open the application
When I click on sign-in
And I enter the username and password
And I click on Login
Then I validate the message "login succesfully"
And I close the browser
