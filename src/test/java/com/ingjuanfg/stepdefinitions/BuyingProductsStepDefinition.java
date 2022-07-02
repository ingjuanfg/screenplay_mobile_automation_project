package com.ingjuanfg.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BuyingProductsStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {word} signed-in SwagLabs app")
    public void actorWantsBuyShirts(String actor) {
    }

    @When("He puts in the cart the {string}")
    public void actorPutShirtCart(String nameProduct) {

    }
    @And("He does the checkout of his purchase")
    public void checkoutPurchase() {
    }

    @Then("He should see that his purchase is successful")
    public void actorShouldSeePurchase() {
    }

    @Then("He should see the message {string}")
    public void actorShouldSeeCheckout(String confirmationMessage) {
    }
}