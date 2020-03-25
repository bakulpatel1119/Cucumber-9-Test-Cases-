
Feature: user should be able to change currency code successfully
  @RunAll9
  Scenario: user should be able to Change Currency Code
    Given user is on home__page
    When user click on US Dollar
    And select Euro Currency
    Then user should change currency code to Euro
    And click on Euro
    And select US Dollar
    Then user should change currency code to US dollar
