package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.tasks.AddProduct;
import com.ingjuanfg.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.ingjuanfg.userinterface.CartShoppingPage.BTN_CART;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyingProductsStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {word} signed-in SwagLabs app")
    public void actorWantsBuyShirts(String actor) {
        theActorCalled(actor).attemptsTo(LoginTask.swaglabs());
    }

    @When("He puts in the cart the {string}")
    public void actorPutShirtCart(String nameProduct) {
        theActorInTheSpotlight().attemptsTo(AddProduct.toTheCart(nameProduct));
    }
/*    @Then("He should see that he has {word} product on the cart")
    public void actorShouldSeeCheckout(String cantProducts) {
        theActorInTheSpotlight()
                .should(seeThat(
                        QuantityProducts.itsEqual(cantProducts))
                        .orComplainWith(QuantityProductsNotEqualException.class, CANTIDAD_NO_CORRRESPONDE_EXCEPTION_MESSAGE));
    }*/

    @Then("He should see that he has {word} product on the cart")
    public void actorShouldSeeCheckoutDos(String cantProducts) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(BTN_CART).text().contains(cantProducts));
    }
}