
Feature: non-Registered User should not be able to refer Product to A Friend successfully

  @RunAll9
  Scenario: non-Registered User should not be able to refer Product to A Friend
    Given user navigate to homepage
    When user click on Book__Category
    And click on Click on product Fahrenheit Ray Bradbury
    And click on Email Friend
    And enter Friends email address
    And enter your email address
    And click on Send_Email button
    Then user should not be able to refer Product to a Friend
    And error message Only registered customers can use email a friend feature should be displayed
