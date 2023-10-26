Feature: Attestations

  Background:
    Given Navigate to Mersys
    When  Enter username and password and click login button
    Then User should login successfully



  Scenario: adding Attestations
    Given Clicks on the element in LeftNav
      | humanResources |
      | hrSetup |
      | attestations  |
    And Click on the element in Dialog
      | addButton  |
    When  User fills the necessary data
      | name | newname3 |
    And Click on the element in Dialog
      | saveButton |


  Scenario: editing Attestations
    Given Clicks on the element in LeftNav
      | humanResources |
      | hrSetup |
      | attestations  |
    And Click on the element in Dialog
      |editButton|
    When  User fills the necessary data //edit burda
      | name | newname2 |
    And Click on the element in Dialog
      | saveButton |


  Scenario: deleting Attestations
    Given Clicks on the element in LeftNav
      | humanResources |
      | hrSetup |
      | attestations  |
    And Click on the element in Dialog
      | deleteButton|
    And Click on the element in Dialog
      | deleteSecondButton  |
    And User delete the element // delete burda 
      | newname2 |
    Then User gets success message
