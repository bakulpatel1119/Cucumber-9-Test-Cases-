Feature: user should be able to compare two different products successfully

  @RunAll9
Scenario: user should be able to compare two different products
Given user is already on home page
When User click on Book___Category
And user Click on Add to Compare for product Fahrenheit by Ray Bradbury
And click on Add to Compare for product First Prize Pies
And click on Product comparison on Popup Bar
Then user should compare two different products
And compare Products message should be displayed
