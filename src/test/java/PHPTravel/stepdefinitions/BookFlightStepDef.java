package PHPTravel.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;

public class BookFlightStepDef {
    @Given("{actor} open Booking Flight page")
    public void iOpenBookingFlightPage(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("Booking Flight"));
    }

    @When("{actor} select Flying Form")
    public void iSelectFlyingForm(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();

        String flyingfrom= dotenv.get("Flying_From");

        actor.attemptsTo(
                InputText.onField("Flying From", flyingfrom));

    }

    @And("{actor} select To Destination")
    public void iSelectToDestination(Actor actor) throws Exception{
        Dotenv dotenv = Dotenv.load();

        String todestination= dotenv.get("To_Destination");

        actor.attemptsTo(
                InputText.onField("To Destination", todestination));
    }

    @And("{actor} select Departure Date")
    public void iSelectDepartureDate(Actor actor) throws Exception{
        actor.attemptsTo(
                ClickOn.button("Departure"));
    }

    @And("{actor} select Passenger")
    public void iSelectPassenger(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Passenger"));

    }

    @And("{actor} click search button flight")
    public void iClickSearchButtonFlight(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Search Flight"));
    }
}
