Feature: select currencies

  @smoke
Scenario: select euro

Given user go to home page
When Select Euro currency from the dropdown list on the top left of home page
Then verify Euro Symbol (€) is shown on the 4 products displayed in Home page