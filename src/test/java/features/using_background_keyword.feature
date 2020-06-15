Feature: Working on background keyword

  Background: lauch desired browser
   Given I launch browser

  Scenario: Search for products in the  google search tab
    Given I launch the application "https://www.google.co.uk/"
    And I search for products in google search box "tuna"
    Then I quit the browser

  Scenario: Search for products in the yahoo search tab
    Given I launch the application "http://www.yahoo.co.uk/"
    And I search for products in yahoo search box "tuna"
    Then I quit the browser
