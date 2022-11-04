@Order
Feature: Order
  As a user
  I want order
  So I can order

  @CreateOrder
  Scenario Outline: create order
    Given set url create order
    When input <id> product id and <qty> quantity
    Then i get "<result>" result
    Examples:
    | id  | qty   | result |
    | 5   | 4     | 200    |

  @GetAllOrder
  Scenario: get all order
    Given set url get all order
    When click get all order
    Then I get 200 OK

  @GetAOrder
  Scenario: get id 828 order
    Given set url get a order
    When click get a order
    Then I get 200 OK