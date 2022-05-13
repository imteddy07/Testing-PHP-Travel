package tasks;

import Potentivio.pageobjects.HireArtistPageObjects;
import Potentivio.pageobjects.PotentivioLoginPageObjects;
import Potentivio.pageobjects.PotentivioRegisterPageObjects;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theURL(String urlType) throws Exception {
        Class url = null;

        switch (urlType) {
            case "Potentivio Page":
                url = PotentivioLoginPageObjects.class;
                break;
            case "Cafe Owner Home Page":
                url = HireArtistPageObjects.class;
                break;
            case "Register Here":
                url = PotentivioRegisterPageObjects.class;
                break;
            default:
                throw new Exception("There is no url type: " + urlType);
        }
        return Task.where("{0} access the login url",
                Open.browserOn().the(url));
    }
}
