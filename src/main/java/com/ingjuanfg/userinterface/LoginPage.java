package com.ingjuanfg.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {
    public static final Target TXT_USER = the("Input Username")
            .locatedForAndroid(MobileBy.AccessibilityId("test-Username"))
            .locatedForIOS(MobileBy.iOSNsPredicateString("name == 'test-Username'"));

    public static final Target TXT_PASSWORD = the("Input Password")
            .locatedForAndroid(MobileBy.AccessibilityId("test-Password"))
            .locatedForIOS(MobileBy.iOSClassChain("**/XCUIElementTypeSecureTextField[`name == 'test-Password'`]"));

    public static final Target BTN_LOGIN = the("Button Login")
            .locatedForAndroid(MobileBy.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"))
            .locatedForIOS(MobileBy.AccessibilityId("test-LOGIN"));
}
