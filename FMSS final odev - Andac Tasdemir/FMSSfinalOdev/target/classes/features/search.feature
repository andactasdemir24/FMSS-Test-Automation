Feature: Search's functionality

  Scenario: query system users
    Given User logs in
    Then User lands on Admin Module
    When The user select their User Role
    And The user clicks the search button


  Scenario: Adding a post
    Given User logs in
    Then User lands on Buzz Module
    When type something in the textbox "what is your mind?"
    And The user clicks the Post button


  Scenario: Adding a post
    Given User logs in
    When User lands on Performance Module
    Then Selects My Tracker module from four titles
    Then goes to the details of the registered user
    And clicks the add log button
    And fills the "log" and "comment" fields and saves by pressing the save button


  Scenario: Check multiple choose in Vacancy
    Given User logs in
    When User lands on Recruitment Module
    And the user clicks on Vacancies
    Then Click on the Vacancy sort item and Sort by descending


  Scenario: Check Contact details in Work email
    Given User logs in
    When User lands on My Info Module
    Then the user click on Contact Details
    And Change the work email fields
    And Click save button


  Scenario: Add a new claim
    Given User logs in
    When User lands on Claim Module
    Then the user click on Assign Claim button
    And fills the "event" and "currency" fields
    And Click create button


  Scenario: Logout
    Given User logs in
    When User lands on Profile Module
    And click logout button








