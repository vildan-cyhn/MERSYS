Feature: Document Types Management

  Background:
    Given Navigate to Mersys
    When  Enter username and password and click login button
    Then User should login successfully

  Scenario: Adding document type
    Given Clicks on the element in LeftNav
      | setup           |
      | setupParameters |
      | documentTypes   |
    And Click on the element in Dialog
      | addButton |
    When User fills the necessary datas
      | name        | Transcript  |
      | description | Outstanding |
    And select a stage type from down drop menu
    And Click on the element in Dialog
      | saveButton |
    Then User gets success message

  Scenario: Editing document type
    Given Clicks on the element in LeftNav
      | setup           |
      | setupParameters |
      | documentTypes   |
    And user edits two elements
      | Transcript |Certificate  | Outstanding | Excellent |
    And click on a different stage type
    And Click on the element in Dialog
      | saveButton |
    Then User gets success message

  Scenario: search function on the page
    Given Clicks on the element in LeftNav
      | setup           |
      | setupParameters |
      | documentTypes   |
    And User search the elements
      | Certificate |

  Scenario: Deleting document type
    Given Clicks on the element in LeftNav
      | setup           |
      | setupParameters |
      | documentTypes   |
    And User delete the elements
      | Certificate |
    Then User gets success message

