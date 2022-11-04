@Product
Feature: Product
  As a user
  I want see product
  So I can see product

  @CreateProduct
  Scenario Outline: Create data product
    Given set url product
    When input "<name>" name "<desc>" desc <price> price and categories <categ>
    Then I get the "<result>" result
    Examples:
    |name     | desc              | price   | categ  | result    |
    | Samsung | play has no limit | 299     | 2      | get 200   |
    |         | play has no limit | 732     | 4      | get 500   |

  @GetProduct
  Scenario: Get product valid id
    Given set url get product
    When input id product
    Then I get 200 OK

  @DeleteProduct
  Scenario: Delete product with id
    Given set url delete product
    When delete product with id
    Then I get 200 OK