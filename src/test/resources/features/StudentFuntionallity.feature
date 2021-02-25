Feature: As a students, I should be able to see tables with default info


  Scenario Outline: verify tables with default info
    Given I login using "<email>" and "<password>"
    Then table should have following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

    Examples:
      | email             | password |
      | student62@library | KbybTpIZ |
      | student63@library | Jg2orVoF |
      | student64@library | pbdQAvkN |