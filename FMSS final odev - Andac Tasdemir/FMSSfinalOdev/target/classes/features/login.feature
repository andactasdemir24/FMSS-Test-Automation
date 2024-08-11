Feature: Login page user login verification

  Scenario: Verify username and password
    Given User lands on Login page
    When The user enters their username
    Then The user enters their password
    And The user clicks the login button

  Scenario: not Verify username and password
    Given User lands on Login page
    When The user enters their wrong "username"
    Then The user enter their wrong "password"
    And the user click the login button