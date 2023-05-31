Feature: F07_followUs | users could open followUs links

  Background: A user open home page URL
    Given go home page URl
  @smoke
  Scenario: User opens Facebook link
    When user clicks on the Facebook link
    Then the Facebook page is opened in a new tab
    And the current facebook URL should be "https://www.facebook.com/nopCommerce"
  @smoke
  Scenario: User opens Twitter link
    When user clicks on the Twitter link
    Then the Twitter page is opened in a new tab
    And the current twitter URL should be "https://twitter.com/nopCommerce"
  @smoke
  Scenario: User opens RSS link
    When user clicks on the RSS link
    #Then the RSS page is opened in a new tab
    Then the current rss URL should be "https://demo.nopcommerce.com/new-online-store-is-open"
  @smoke
  Scenario: User opens YouTube link
    When user clicks on the YouTube link
    Then the YouTube page is opened in a new tab
    And the current youtube URL should be "https://www.youtube.com/user/nopCommerce"