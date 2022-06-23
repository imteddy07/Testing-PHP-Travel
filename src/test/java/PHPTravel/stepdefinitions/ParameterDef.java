package PHPTravel.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import tasks.VerifyDisplayed;


public class ParameterDef {
    @Then("{actor} can login successfully")
    public void iCanLoginSuccessfullyAsCafeOwner(Actor actor) throws Exception {
        actor.attemptsTo(VerifyDisplayed.element("Welcome Back"));
    }
}
