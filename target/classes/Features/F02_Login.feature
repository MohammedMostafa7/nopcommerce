Feature: F02_Login | users could use login functionality to use their accounts

  Background: A user open login page URL
    Given user go to login page

  @smoke
  Scenario: user could login with valid email and password
  When user login with valid "test@example.com" and "P@ssw0rd"
  And user press on login button
  Then user login to the system successfully

  @smoke
  Scenario: user could login with invalid email and password
  When user login with invalid "wrong@example.com" and "P@ssw0rd"
  And user press on login button
  Then user could not login to the system