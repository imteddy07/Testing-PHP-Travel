package PHPTravel.stepdefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;

public class BookHotelStepDef {
    @Given("{actor} open Booking Hotel page")
    public void iOpenBookingHotelPage(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("Booking Hotel"));
    }

    @When("{actor} select City Name")
    public void iSelectCityName(Actor actor) throws Exception{
        actor.attemptsTo(
                ClickOn.button("City Name"));
        Dotenv dotenv = Dotenv.load();

        String cityfield= dotenv.get("City_Field");

        actor.attemptsTo(
                InputText.onField("City Field", cityfield));
    }

    @And("{actor} select CheckIn Date")
    public void iSelectCheckInDate(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Check In"));
    }

    @And("{actor} select Checkout Date")
    public void iSelectCheckoutDate(Actor actor) throws Exception{
        actor.attemptsTo(
                ClickOn.button("Check Out"));
    }

    @And("{actor} select Traveller")
    public void iSelectTraveller() {
    }

    @And("{actor} click search button")
    public void iClickSearchButton(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Submit"));
    }
}
