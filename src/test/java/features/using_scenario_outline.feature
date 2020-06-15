Feature: Working on scenario outline 

Scenario Outline: Google Search 

Given I launch the browser and application
When I enter the "<products>" to search
Then I search for the related product details
And I close the browser

Examples:
|products|
|toys|
|tuna|
|testing|