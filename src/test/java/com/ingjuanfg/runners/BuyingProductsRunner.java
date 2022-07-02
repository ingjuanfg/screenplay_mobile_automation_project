package com.ingjuanfg.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buying_products.feature",
        glue = "com.ingjuanfg.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BuyingProductsRunner {
}
