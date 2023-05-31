Feature: Hover Categories

  @smoke
  Scenario: Select random main category and sub-category
    Given open home page URl
    When the user selects a random main category and hover on it
    And selects a random sub-category
    Then the sub-category page title should contain the selected sub-category