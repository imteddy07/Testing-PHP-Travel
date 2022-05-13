@registercafe
Feature: Potentivio - Register

  Scenario: User Register as Cafe Owner Successfully
    Given I open Potentivio page
    When I click button Cafe Owner
    And I click Register Here
    And I input data register
    And I click button register
    Then I can register successffully
