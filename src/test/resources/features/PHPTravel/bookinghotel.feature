@bookinghotel
Feature: PHP Travel - Booking Hotel

  Scenario: User successfully booking hotel
    Given I open Booking Hotel page
    When I select City Name
    And I select CheckIn Date
    And I select Checkout Date
    And I select Traveller
    And I click search button
