Feature: Google Maps Search

  Scenario Outline: Search Dublin city on maps
    Given I have open the browser
    And I search <search_place> on Google Maps
    Then Should return <search_place> on search result
    And Should display <search_place> on destination input clicking on directions

    Examples: 
      | search_place |
      | "Dublin"     |