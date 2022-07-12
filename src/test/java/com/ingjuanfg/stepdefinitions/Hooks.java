package com.ingjuanfg.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

}
