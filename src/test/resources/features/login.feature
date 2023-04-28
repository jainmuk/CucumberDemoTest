Feature: To test the login functionality

  Scenario: check the signin functionality on makemytrip.com
    Given I am on the login page url "https://www.makemytrip.com"
    When I enter username as "jainmuk@gmail.com" and password as "786786"
    Then I land on home page