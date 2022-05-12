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

    @And("{actor} access artist list")
    public void accessArtist(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("Cafe Owner Home Page"),
                VerifyDisplayed.element("Artist List")
        );
    }

    @When("{actor} select artist from list")
    public void iSelectArtistFromList(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.artistList()
        );
    }

//    @Then("{actor} can see detail artist")
//    public void iCanSeeDetailArtist(Actor actor) {
//            actor.attemptsTo(
//                    Ensure.thatTheCurrentPage().currentUrl().contains("/owner/detail-owner/53")
//            );

    }

