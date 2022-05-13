package Potentivio.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;
import tasks.VerifyDisplayed;

public class RegisterStepDef {
    @And("{actor} click Register Here")
    public void iClickRegisterHere(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("Register Here"));
    }

    @And("{actor} input data register")
    public void iInputDataRegister(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();

        String cafe = dotenv.get("Cafe_Name");
        String owner = dotenv.get("Owner_Name");
        String emailcafe = dotenv.get("Email_Name");
        String passwordcafe = dotenv.get("Password_Name");
        String addresscafe = dotenv.get("Address_Name");

        actor.attemptsTo(
                InputText.onField("Cafe Name", cafe),
                InputText.onField("Owner Cafe", owner),
                InputText.onField("Email Cafe", emailcafe),
                InputText.onField("Password Cafe", passwordcafe),
                InputText.onField("Address Cafe", addresscafe));
    }

    @And("{actor} click button register")
    public void iClickRegisterButton(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Register Cafe Owner")
        );
    }
    @Then("{actor} can register successffully")
    public void iCanRegisterSuccessfully (Actor actor) throws Exception{
        actor.attemptsTo(
                VerifyDisplayed.element("Success Register")
        );
    }
}
