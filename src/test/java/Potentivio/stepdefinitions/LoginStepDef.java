package Potentivio.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;

public class LoginStepDef {
    @Given("{actor} open Potentivio page")
    public void loadPotentivioPage(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("Potentivio Page"));
    }

    @When("{actor} click button Cafe Owner")
    public void iClickButtonCafeOwner(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Cafe Owner")
        );

    }

    @And("{actor} input email and password Cafe Owner")
    public void iInputEmailAndPassword(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();

        String email = dotenv.get("Email_Cafe");
        String password = dotenv.get("Password_Cafe");

        actor.attemptsTo(
                InputText.onField("Cafe Owner Email", email),
                InputText.onField("Cafe Owner Password", password)
        );
    }

    @And("{actor} click login button Cafe Owner")
    public void iClickLoginButtonCafeOwner(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Login Cafe Owner")
        );
    }

    @Then("{actor} can login successfully as Cafe Owner")
    public void iCanLoginSuccessfullyAsCafeOwner(Actor actor) {
        actor.attemptsTo(
                Ensure.thatTheCurrentPage().currentUrl().contains("/owner")
        );
    }
}
