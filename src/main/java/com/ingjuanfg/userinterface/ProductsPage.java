package com.ingjuanfg.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class ProductsPage {
    public static final Target LBL_PRODUCTS = the("Title Products")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='PRODUCTS']"))
            .locatedForIOS(MobileBy.xpath("//*[@text='PRODUCTS']"));
}
