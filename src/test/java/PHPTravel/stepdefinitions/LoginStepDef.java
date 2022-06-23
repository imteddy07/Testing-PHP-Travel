package PHPTravel.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;

public class LoginStepDef {

    @And("{actor} input email and password PHP Travel")
    public void iInputEmailAndPassword(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();

        String email = dotenv.get("Email_PHP");
        String password = dotenv.get("Password_PHP");

        actor.attemptsTo(
                InputText.onField("PHP Email", email),
                InputText.onField("PHP Password", password)
        );
    }

    @And("{actor} input email and wrong password PHP Travel")
    public void iInputEmailAndWrongPassword(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();

        String email = dotenv.get("Email_PHP");
        String password = dotenv.get("Wrong_Password_PHP");

        actor.attemptsTo(
                InputText.onField("PHP Email", email),
                InputText.onField("PHP Password", password)
        );
    }

    @And("{actor} click login button")
    public void iClickLoginButtonCafeOwner(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Login Button")
        );
    }

    @Given("{actor} open PHP Travel login page")
    public void LoadPHPTravelPage(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("PHP Travel Page"));
    }

}
