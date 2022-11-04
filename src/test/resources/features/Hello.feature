@Hello
Feature: Hello
  As a user
  I want get hello
  So I can see hello

  Scenario: Get hello
    Given set url hello valid
    When get hello valid
    Then I get 200 OK