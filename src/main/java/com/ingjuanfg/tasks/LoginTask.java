package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.ingjuanfg.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(TXT_USUARIO),
                Enter.theValue("secret_sauce").into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginTask swaglabs(){
        return instrumented(LoginTask.class);
    }
}
