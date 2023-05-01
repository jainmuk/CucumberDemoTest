
Feature: To test the login functionality

  Background: Launch URL
    Given I am on the login page url "http://127.0.0.1:5500/index.html"

  Scenario: check the signin functionality
    When I click on about page
    Then it lands on about page
    And add product to a cart

  Scenario: check the pages section
    When i click on pages tab
    Then it shows a drop down list
    And I click on The Team option
    And it lands on appropriate page
