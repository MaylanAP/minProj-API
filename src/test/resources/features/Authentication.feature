@Authentication
Feature: Authentication
  As a user
  I want run authentication
  So I can run feature authentication

  @Register
  Scenario: Registration with valid email password and full name
    Given set url registration
    When input email password and fullname valid 
    Then I get 200 OK

  Scenario: Registration with invalid email password and full name
    Given set url registration
    When input email password and fullname invalid
    Then I get 400 Bad Request

  @Login
  Scenario Outline: Login
    Given set url login
    When input email "<email>" password "<pass>"
    Then I get result "<result>"
    Examples:
      | email         | pass        | result  |
      | map2@mail.com | akuncobaku  | 200     |
      | may@mail.com  | akuncobaku  | 400     |
      | may2@mail.com | akucoba1    | 400     |
      |               |             | 400     |
      |               | akuncobaku  | 400     |
      | may2@mail.com |             | 400     |

  @GetUser
  Scenario: Get user valid token
    Given set url get user
    When I request list user valid
    Then I get 200 OK

  Scenario: Get user invalid token
    Given set url get user
    When I request list user invalid
    Then I get 401 Unauthorization