package com.ingjuanfg.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class ProductsPage {
    public static final Target LBL_PRODUCTS = the("Title Products")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='PRODUCTS']"))
            .locatedForIOS(MobileBy.xpath("//*[@text='PRODUCTS']"));

    public static final Target LBL_PRODUCT = Target.the("Producto a comprar")
            .locatedBy("//android.widget.TextView[@text='{0}']");

    public static final Target BTN_ADD_TO_CART = Target.the("Boton para agregar al carrito")
            .locatedForAndroid(MobileBy.AccessibilityId("test-ADD TO CART"))
            .locatedForIOS(MobileBy.AccessibilityId("test-ADD TO CART"));

}
