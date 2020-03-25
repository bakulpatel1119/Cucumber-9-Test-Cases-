Feature: guest user should be able to add comments successfully
  @RunAll9
  Scenario: guest user should be able to add comments
    Given user is on HomePage_
    When user click on Details Button under News
    And enter Title
    And enter comments
    And click on New Comments button
    Then user should add comments successfully
    And message should display News comment is successfully added
