Feature: Google Maps Search

  Scenario: Search Dublin city on maps
    Given I have open the browser
    And I search "Dublin" on Google Maps
    Then Should return "Dublin" on search result
    And Should display "Dublin" on destination input clicking on directions