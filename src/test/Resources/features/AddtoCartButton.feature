
Feature: user should see Add to cart button for featured products successfully

  @RunAll9
  Scenario: user should be able to see Add to Cart Button on all Featured products
    Given user is on Home___Page
    When user Scroll Down page to Feature Products
    Then user should see Add to Cart Button on all Featured products
