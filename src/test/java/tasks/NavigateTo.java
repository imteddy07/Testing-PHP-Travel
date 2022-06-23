package tasks;

import PHPTravel.pageobjects.*;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theURL(String urlType) throws Exception {
        Class url = null;

        switch (urlType) {
            case "Booking Flight":
                url = BookingFlightPageObjects.class;
                break;
            case "Booking Hotel":
                url = BookingHotelPageObjects.class;
                break;
            case "PHP Travel Page":
                url = PHPTravelPageObjects.class;
                break;
            case "PHP Travel Homepage":
                url = PHPTravelPageObjects.class;
                break;
            default:
                throw new Exception("There is no url type: " + urlType);
        }
        return Task.where("{0} access the login url",
                Open.browserOn().the(url));
    }
}
