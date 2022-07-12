package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.exceptions.LoginIsNotCompleteException;
import com.ingjuanfg.questions.LoginSwaglabs;
import com.ingjuanfg.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.ingjuanfg.exceptions.LoginIsNotCompleteException.LOGIN_FAIL_MESSAGE_EXCEPTION;
import static com.ingjuanfg.userinterface.ProductsPage.LBL_PRODUCTS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginSwaglabsStepDefinition {

    @When("{word} types his credentials on SwagLabs app")
    public void actorLoginIntoApp(String actor) {
        theActorCalled(actor).attemptsTo(Login.inSwaglabs());
    }

    @Then("He should see the product page")
    public void actorShouldSeeProductsTitle() {
        theActorInTheSpotlight().should(seeThat(
                LoginSwaglabs.isSuccesfully())
                .orComplainWith(LoginIsNotCompleteException.class,LOGIN_FAIL_MESSAGE_EXCEPTION )
        );
    }

    @Then("He ensure that is on product page")
    public void actorShouldSeeProductPage() {
        withCurrentActor(Ensure.that(LBL_PRODUCTS).isDisplayed());
    }
}