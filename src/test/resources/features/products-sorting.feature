Feature: Products sorting
  as a customer i want to sort products by different criteria
  So that I can find what i need

  Scenario: Sort by price
    Given I open the homepage
   And I search a product by "vase"
   When I sort the products by "Price"
   And I sort the products in descending order
   Then products are sorted by "Pice" in descending order