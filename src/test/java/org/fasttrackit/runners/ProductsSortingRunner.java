package org.fasttrackit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@CucumberOptions(
        glue = {"org.fasttrackit"},
        features = {"src/test/resources/features/products-sorting.feature"},
        plugin = {"html:target/cucumber", "json:target/json-reports/productsSorting.json"}
)
@RunWith(Cucumber.class)
public class ProductsSortingRunner {


}
