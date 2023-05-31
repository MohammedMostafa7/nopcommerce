Feature: Home Sliders

  Background: A user open home page URL
    Given go to home page URl

  @smoke
  Scenario: First slider is clickable on home page
    When I click on the first slider
    Then I should be redirected to iphone 14 pro max page

  @smoke
  Scenario: Second slider is clickable on home page
    When I click on the second slider
    Then I should be redirected to s22 ultra page