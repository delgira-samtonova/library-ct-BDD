Feature: user group category features
@wip
  Scenario: verify user categories
    Given the user login as a "librarian"
    When the user click users module
    Then the user should see the following options:
      | ALL       |
      | Librarian |
      | Students  |
