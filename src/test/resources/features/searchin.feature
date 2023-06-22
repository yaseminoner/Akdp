@smoke
Feature: Searching AKDP Functionality
  User Story:
  As a user, I should be able to search on the main page


  Scenario: User should be able to search the main page
    When user enters the main page
    And user clicks neewsroom button
    And user clicks kundenstorys button
    And user scroll down and up
    And user goes back to main page
    Then user should see the main page
