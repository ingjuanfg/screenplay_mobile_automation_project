package com.ingjuanfg.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProductPage {
    public static final Target LBL_PRODUCT = the("Producto a comprar").locatedBy("//android.widget.TextView[@text='{0}']");
    public static final Target BTN_ADD_TO_CART = the("Boton para agregar al carrito")
            .located(MobileBy.AccessibilityId("test-ADD TO CART"));
}
