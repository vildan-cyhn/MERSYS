@Smoke
@Regression
Feature: Login functionality


  Scenario: LoginPositive with valid username and password
    Given Navigate to Mersys
    When  Enter username and password and click login button
    Then User should login successfully

  Scenario: LoginNegative with unvalid username and password
    Given Navigate to Mersys
    When  Enter unvalid username and password and click login button
    Then User should not login successfully


