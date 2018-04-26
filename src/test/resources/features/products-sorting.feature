Feature: Products sorting
  as a customer i want to sort products by different criteria
  So that I can find what i need

  Scenario Outline: Sort by price
    Given I open the homepage
    And I search a product by "<Keyword>"
    When I sort the products by "<sort criteria>"
    And I sort the products in "<sort direction>" order
    Then products are sorted by "<sort criteria>" in "<sort direction>" order
    Examples:
      | Keyword | sort criteria | sort direction |
      | vase    | Price         | descending     |
      | shirt   | Name          | ascending      |