Feature: Basic information

  Background:
    Given The basics API sample data

  Scenario: All the seasons
    When I want a list of all seasons
    Then I expect to see the following list
      | 3000 |
      | 3001 |
      | 3002 |
      | 3003 |
      | 3004 |

  Scenario: Total of races
    When I want the total of races
    Then I expect that the total is 25

  Scenario: Races per season
    When I want the total races per season
    Then I expect to see the following table
      | 3000 | 5 |
      | 3001 | 5 |
      | 3002 | 5 |
      | 3003 | 5 |
      | 3004 | 5 |

  Scenario: Racers per season
    When I want the total racers per season
    Then I expect to see the following table
      | 3000 | 4 |
      | 3001 | 4 |
      | 3002 | 4 |
      | 3003 | 4 |
      | 3004 | 4 |

  Scenario: Constructors per season
    When I want the total constructors per season
    Then I expect to see the following table
      | 3000 | 2 |
      | 3001 | 2 |
      | 3002 | 2 |
      | 3003 | 2 |
      | 3004 | 2 |
