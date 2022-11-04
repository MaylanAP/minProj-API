@CategoryProduct
Feature: Create Category Product
  As a user
  I want create category product
  So I can create category product

  @CreateCateg
  Scenario: Create Category Product valid
    Given set url create category product
    When input name and description valid
    Then I get 200 OK

  Scenario: Create Category Product invalid
    Given set url create category product
    When input name and description invalid
    Then I get 400 Bad Request

  @GetACateg
  Scenario: Get category with valid id
    Given set url get category product valid
    When I input valid id
    Then I get 200 OK

  Scenario: Get category with invalid id
    Given set url get category product invalid
    When I input invalid id
    Then I get 404 Not Found

  @GetAllCateg
  Scenario: Get all category
    Given set url get all category
    When click get
    Then I get 200 OK