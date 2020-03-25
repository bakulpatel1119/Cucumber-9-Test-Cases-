    Feature: user should be able to register successfully when filled all compulsory field

      @RunAll9
      Scenario: user should be able to register successfully when filled all compulsory field
      Given user is on Home Page
      When user click on Register Button
      And enter Firstname
      And enter Lastname
      And enter Email address
      And enter password
      And enter confirm password
      And click on Register button
      Then user should be registered successfully
      And your registration Completed message should be displayed
