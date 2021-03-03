
@librarian
Feature: Login feature
  Scenario: Login as a librarian
    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed
@student
  Scenario: Login as a student
    Given I am on the login page
    When I login as a student
    Then books should be displayed
@login
  Scenario Outline: Login as different roles and assert the title
    Given the user login as a "<role>"
    Then the user on  "<page>"

    Examples:
      | role          | page            |
      | student       | books        |
      | librarian     | dashboard       |