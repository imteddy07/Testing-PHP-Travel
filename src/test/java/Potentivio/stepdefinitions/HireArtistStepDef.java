package Potentivio.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.ClickOn;
import tasks.NavigateTo;
import tasks.VerifyDisplayed;

public class HireArtistStepDef {

    @When("{actor} access artist list")
    public void accessArtist(Actor actor) throws Exception {
        actor.attemptsTo(
                VerifyDisplayed.element("Artist List")
        );
        actor.wasAbleTo(NavigateTo.theURL("Cafe Owner Home Page")
        );

    }

    @Then("{actor} select artist from list")
    public void iSelectArtistFromList(Actor actor) throws Exception {
        actor.attemptsTo(
                VerifyDisplayed.element("Artist List"),
                ClickOn.artistList()
        );
    }
    }

