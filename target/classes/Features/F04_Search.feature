Feature: Search Feature

  Background: A user open home page URL
    Given home page URl

  @smoke
  Scenario Outline: User could search using product name
    When user enters <product> Name in the search box
    Then user should see relevant results for product

    Examples:
      | product    |
      | "book"     |
      | "laptop"   |
      | "nike"     |
  @smoke
  Scenario Outline: User could search for product using SKU
    When user enters product <sku> in the search box
    Then user should see the product with matching <sku>

    Examples:
      | sku          |
      | "SCI_FAITH"  |
      | "APPLE_CAM"  |
      | "SF_PRO_11"  |