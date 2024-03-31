Feature: Checking the Login Functionality

  Background: 
    Given user should be on login page

  Scenario: Check the login Functionality with valid credentials
    When user pass the values for "Admin" and "admin123"
    And clicking login button
    Then user landed on home page
  
  @datas
  Scenario Outline: Check the login Functionality with valid credentials
    When user pass the values for "<username>" and "<password>"
    And clicking login button
    Then user landed on home page

    Examples: 
      | username | password |
      | Fita     | fita123  |
      | tech     | tech123  |
      | Admin    | admin123 |
