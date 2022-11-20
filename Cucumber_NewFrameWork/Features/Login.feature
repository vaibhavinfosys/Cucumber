Feature: Login

  Scenario: Verify login is succesfull with valid data
    Given User launch chrome browser
    When User open URL "https://demo.actitime.com/login.do"
    And User enter UserName as "admin" and password as "manager"
    And click on login button
    Then User navigate to homepage
    And close browser

  Scenario Outline: Login Data Driven
    Given User launch chrome browser
    When User open URL "https://demo.actitime.com/login.do"
    And User enter UserName as "<username>" and password as "<password>"
    And click on login button
    Then User navigate to homepage
    And close browser

    Examples: 
      | username | password   |
      | admin    | manager    |
      | admin    | manager565 |
