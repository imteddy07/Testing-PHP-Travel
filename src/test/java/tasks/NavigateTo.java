package tasks;

import Potentivio.pageobjects.PotentivioLoginPageObjects;
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
            default:
                throw new Exception("There is no url type: " + urlType);
        }
        return Task.where("{0} access the login url",
                Open.browserOn().the(url));
    }
}
