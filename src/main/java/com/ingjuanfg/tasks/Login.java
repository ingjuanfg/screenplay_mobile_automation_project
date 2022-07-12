package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ingjuanfg.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USER, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue("standard_user").into(TXT_USER),
                Enter.theValue("secret_sauce").into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static Performable inSwaglabs(){
        return instrumented(Login.class);
    }
}
