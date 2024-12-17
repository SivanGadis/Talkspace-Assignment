Feature: E-Commerce Product Management.

  @Test

  Scenario Outline: Add a book or more to catalog Or Update an existing one.
    Given I login to the app with manager
    Given I have a new product with "<name>" And "<price>" And "<category>" And "<Inventory>" And "<discount>" And "<weight>" And "<color>" And "<manufacture>" And "<moreAtr>"
    When I check if the product exists through API Jsonfile "<name>" if not than create ""
    And I verify the product exists in database "Select <name> from Test1"
    And I check the product details via API "<name>"
    Then the product should be created successfully

    Examples:
      | name       | price | category | Inventory | discount |weight | color |manufacture |moreAtr |
      | TestBook1   | 29.99 | Books    | 2 | 20% | 20kg | Black | Moshe | 1,2,3,,4 |
      | TestBook2   | 29.99 | Books    |  2 | 20% | 20kg | Black | Moshe | 1,2,3,,4 |


  Scenario: Process order and logout
    Given I login to the app with manager
    Given I have an active order
    When I process the order
    And I logout from the system
