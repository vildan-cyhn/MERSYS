Feature: Position Functionality

  Background:
    Given Navigate to Mersys
    When  Enter username and password and click login button
    Then User should login successfully

  Scenario: adding new Position
    Given Clicks on the element in LeftNav
      | humanResources |
      | hrSetup        |
      | positions      |
    And Click on the element in Dialog
      | addButton |
    When  User fills the necessary data
      | name      | DATA SCIENCE |
      | shortName | DS123        |
    And Click on the element in Dialog
      | saveButton |
    Then User gets success message

  Scenario: editing Position
    Given Clicks on the element in LeftNav
      | humanResources |
      | hrSetup        |
      | positions      |
    And User edit two elements in DCV
      | DATA SCIENCE | DS123 | CYBER SECURITY | CS123 |

    And Click on the element in Dialog
      | saveButton |

    Then User gets success message

  Scenario: search function on the page
    Given Clicks on the element in LeftNav
      | humanResources |
      | hrSetup        |
      | positions      |
    And User should see  the element
      | CYBER SECURITY | CS123 |
    And  user should see the active button

  Scenario: deleting saved Position
    Given Clicks on the element in LeftNav
      | humanResources |
      | hrSetup        |
      | positions      |

    And User delete the elements in Position menu
      | CYBER SECURITY | CS123 |
    Then User gets success message



