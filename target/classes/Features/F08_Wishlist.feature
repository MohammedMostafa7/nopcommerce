Feature: Wishlist Feature

  Background: A user open home page URL
    Given open the home page URl

  @smoke
  Scenario: Add product to wishlist and verify success message
    When I click on the wishlist button for HTC One M8 Android L5 Lollipop
    Then I should see the success message "The product has been added to your wishlist" with green background color

  @smoke
  Scenario: Verify quantity in wishlist
    When I click on the wishlist button for HTC One M8 Android L5 Lollipop and wait for success message to disappear
    And I click on the Wishlist tab
    Then I should see the quantity value greater than 0