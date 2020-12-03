Feature: Pilots information

  Background:
    Given The positions API sample data

  Scenario: Starting Grid
    When I want the starting grid of the season 4000 round 1
    Then I expect to see the following pilot table
      | pilot         | number | grid | podium | season | round | race               | circuit          |
      | Robert Smith  | 42     | 1    | 2      | 4000   | 1     | American Gran Prix | USA Speed Rapids |
      | Nelson Silva  | 31     | 2    | 1      | 4000   | 1     | American Gran Prix | USA Speed Rapids |
      | Paolo Riccati | 23     | 3    | 4      | 4000   | 1     | American Gran Prix | USA Speed Rapids |
      | Franz Lyndt   | 14     | 4    | 3      | 4000   | 1     | American Gran Prix | USA Speed Rapids |

#  Scenario: Podium Grid
#    When I want the podium grid of the season 1 round 1
#    Then I expect to see the following pilot table
#      | pilot | number | grid | podium | season | race | circuit |
#
#  Scenario: The Winner
#    When I want the winner of the season 1 round 1
#    Then I expect to see the following pilot table
#      | pilot | number | grid | podium | season | race | circuit |
#
#  Scenario: The Pole Position
#    When I want the pole position of the season 1 round 1
#    Then I expect to see the following pilot table
#      | pilot | number | grid | podium | season | race | circuit |
#
#  Scenario: End to End Victory Race Checker
#    When I want to check if the season 1 round 1 had an end to end victory
#    Then I expect that this race had an end to end victory
#
#    When I want to check if the season 1 round 2 had an end to end victory
#    Then I expect that this race did not have an end to end victory
#
#  Scenario: End-to-End Victories of a Season
#    When I want to get all the end to end victories of season 1
#    Then I expect to see the following pilot table
#      | pilot | number | grid | podium | season | race | circuit |
#
#  Scenario: End-to-End Victories of all time
#    When I want to get all the end to end victories of all time
#    Then I expect to see the following pilot table
#      | pilot | number | grid | podium | season | race | circuit |
