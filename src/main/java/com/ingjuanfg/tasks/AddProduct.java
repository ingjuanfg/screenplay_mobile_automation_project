package com.ingjuanfg.tasks;

import com.ingjuanfg.interactions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ingjuanfg.userinterface.ProductPage.BTN_ADD_TO_CART;
import static com.ingjuanfg.userinterface.ProductPage.LBL_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {

    private String nameProduct;

    public AddProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_PRODUCT.of(nameProduct)),
                Scroll.untilVisibleTarget(BTN_ADD_TO_CART),
                Click.on(BTN_ADD_TO_CART)
        );
    }

    public static Performable toTheCart(String nameProduct){
        return instrumented(AddProduct.class, nameProduct);
    }
}
