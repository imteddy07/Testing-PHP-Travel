@hireartist
Feature: Potentivio - Hire Artist

  Background:
    Given I open Potentivio page
    When I click button Cafe Owner
    And I input email and password Cafe Owner
    And I click login button Cafe Owner
    And I access artist list


    Scenario: User hire artist successfully
      When I select artist from list
#      And I click on Hire button
#      And I select date
#      And I click on Save button
#      Then I can see pop up sukses hire artist