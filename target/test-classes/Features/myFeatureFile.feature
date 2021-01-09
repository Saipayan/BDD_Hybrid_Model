

@SearchCars_Positive
Feature: Acceptance Testing to validate Search CAR functionality
  

  @SearchCars_Positive
  Scenario: Validate Search Car PAge
    Given I am on the Home Page "https://www.carsguide.com.au/"
    When I Enter "MAKE" as "Alfa Romeo"
    When I ENter "Model" as "GT"
    And I wait for 5000 milliseconds
    And I move to "Show_Button" and click the button
    Then I am in new page

  