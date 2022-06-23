@phplogin
  Feature: PHP Travel - Login

    @success
    Scenario: User Success Login PHP Travel
      Given I open PHP Travel login page
      And I input email and password PHP Travel
      And I click login button
      Then I can login successfully

    @failed
    Scenario: User Success Login PHP Travel
      Given I open PHP Travel login page
      And I input email and wrong password PHP Travel
      And I click login button
      Then I can login successfully