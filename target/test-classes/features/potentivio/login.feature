@login
  Feature: Potentivio - Login as cafe owner

    Scenario: User Login as Cafe Owner Successfully
      Given I open Potentivio page
      When I click button Cafe Owner
      And I input email and password Cafe Owner
      And I click login button Cafe Owner
      Then I can login successfully as Cafe Owner