Feature: Login to test system

  @P1 @P2
  Scenario: Login Page
    Given I am on SauceDemo login Page
    When I enter username
    And I enter password
    And I Click on the login button
    Then I should land to PLP page and click menu
    And I look for max priced value item
