@Smoke @Regression
Feature: Facebook Login

  Scenario: Log in  with email
    Given user is on Facebook login page
    When user enters email and password
    And user clicks login button
    Then user should be in profile page
    When user inputs "Fetch Rewards" in search field and presses enter keyboard
    Then user should see Fetch Rewards profile page
    When user goes to Fetch Rewards page
    And user clicks like button
    Then like button should be displayed as liked

