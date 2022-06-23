@bookingflight
Feature: PHP Travel - Booking Flight

  Scenario: User successfully booking flight
    Given I open Booking Flight page
    When I select Flying Form
    And I select To Destination
    And I select Departure Date
    And I select Passenger
    And I click search button flight