@hireartist
Feature: Potentivio - Hire Artist

  Background:
    Given I open Potentivio page
    When I click button Cafe Owner
    And I input email and password Cafe Owner
    And I click login button Cafe Owner



    Scenario: User access detail artist successfully
      When I access artist list
      And I select artist from list
