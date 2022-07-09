package com.ingjuanfg.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {
    public static final Target TXT_USUARIO = the("Campo Usuario")
            .located(MobileBy.AccessibilityId("test-Username"));

    public static final Target TXT_PASSWORD = the("Campo Password")
            .located(MobileBy.xpath("//android.widget.EditText[@content-desc='test-Password']"));

    public static final Target BTN_LOGIN = the("Campo Password")
            .located(MobileBy.AccessibilityId("test-LOGIN"));
}
