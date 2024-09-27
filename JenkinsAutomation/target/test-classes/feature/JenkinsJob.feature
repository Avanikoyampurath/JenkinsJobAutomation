Feature: Automate jenkins job

  Background:
    Given user open website
    Then user is on login page

  Scenario: validate login to jenkins
    When user enter login credentials
    And click on sign in
    Then user is on home page

  Scenario: add new jenkins job
    When user enter login credentials
    And click on sign in
    Then user is on home page
    When user click on new item
    Then verify user is on new item page
    When user add new project
    Then verify user is on configure page
    When user configure the project
    And click on save
    Then verify build page is displayed


