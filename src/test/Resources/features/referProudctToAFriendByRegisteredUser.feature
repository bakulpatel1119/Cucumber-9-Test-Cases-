Feature: user should be able to refer Product to A Friend successfully

  @RunAll9
  Scenario: user should be able to refer Product to A Friend
    Given user is logged in and is on Home Page
    When user click on Book_Category
    And Click on Click on product Fahrenheit by Ray Bradbury
    And Click on Email a Friend
    And Enter Friend's email address
    And Click on Send Email button
    Then User should be able to refer Product to a Friend
    And Your message has been sent message should be displayed.

