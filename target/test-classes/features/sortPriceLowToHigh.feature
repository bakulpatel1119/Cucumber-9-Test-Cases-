
Feature: use should be able to sort product price high to low successfully

  @RunAll9
  Scenario: User should be able to sort product price High to Low
    Given User is on home__page
    When User click on Book__Category
    And Click on Filter Sort By
    And Select Price High to Low
    Then user should be able to sort price High to Low
