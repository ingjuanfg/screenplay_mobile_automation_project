package com.ingjuanfg.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.ingjuanfg.userinterface.CartShoppingPage.BTN_CART;

public class QuantityProducts implements Question<Boolean> {
    private String cantProd;

    public QuantityProducts(String cantProd){
        this.cantProd = cantProd;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return cantProd.equals(BTN_CART.resolveFor(actor).getText());
    }

    public static QuantityProducts itsEqual(String cantProducts){
        return new QuantityProducts(cantProducts);
    }
}
