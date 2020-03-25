Feature: guest user should checkout successfully
  @RunAll9
  Scenario: guest user should be able to checkout
    Given user is on Homepage
    When Click on Book-Category
    And click on Product First-Prize-Pies
    And click on Add to Cart Button
    And click on Shopping Cart Button on Popup Bar
    And click on Agree Terms and Conditions Tick-Box
    And click on Checkout Button
    And click on Checkout as a Guest Button
    And enter guest Customer Details
    And click on Continue_Button
    And click on Credit Card
    And click on Continue-button
    And select MasterCard Credit Card
    And enter payment details
    And click on Confirm button
    Then guest user should checkout successfully
    And message should display Your order has been successfully processed

