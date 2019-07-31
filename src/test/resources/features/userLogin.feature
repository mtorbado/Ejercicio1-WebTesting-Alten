Feature: User login

  Scenario: Valid administrator login
    Given The login web page is accessible
    When I introduce the administrator user & password
    Then The "my Profile" page is shown
    And The "edit Profile" button is enabled