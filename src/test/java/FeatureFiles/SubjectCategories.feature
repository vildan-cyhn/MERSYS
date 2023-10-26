@Regression

Feature: Subject Categories
  Background:
    Given Navigate to Mersys
    When  Enter username and password and click login button
    Then User should login successfully

  Scenario: adding Subject Categories
    Given Clicks on the element in LeftNav
      | education |
      | eduSetup  |
      | subjCat   |
    And Click on the element in Dialog
      | addButton  |
    When  User fills the necessary data
      | name | hhhhhhkltnn |
      | code | 84226584|
    And Click on the element in Dialog
      | saveButton |
    Then User gets success message



  Scenario: editing Subject Categories
    Given Clicks on the element in LeftNav
      | education |
      | eduSetup  |
      | subjCat   |
    And User edit two elements
      | hhhhhhkltnn |  84226584| igdaudn |  78265457|
    And Click on the element in Dialog
      | saveButton |
    Then User gets success message



  Scenario: search function on the page
    Given Clicks on the element in LeftNav
      | education |
      | eduSetup  |
      | subjCat   |
    And User search the element
      | igdaudn |  78265457|
    And  user should see the active button





  Scenario: deleting Subject Categories
    Given Clicks on the element in LeftNav
      | education |
      | eduSetup  |
      | subjCat   |
    And User delete the element
      | igdaudn |  78265457|
    Then User gets success message