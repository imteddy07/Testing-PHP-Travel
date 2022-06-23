package tasks;

import PHPTravel.pageobjects.*;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickOn {
    public static Performable button(String buttonType) throws Exception {
        Target button;

        switch (buttonType) {
            case "Passenger":
                button = BookingFlightPageObjects.PASSENGER;
                break;
            case "Search Flight":
                button = BookingFlightPageObjects.SEARCH_FLIGHT;
                break;
            case "Departure":
                button = BookingFlightPageObjects.DEPARTURE;
                break;
            case "Submit":
                button = BookingHotelPageObjects.SUBMIT;
                break;
            case "Check Out":
                button = BookingHotelPageObjects.CHECK_OUT;
                break;
            case "Check In":
                button = BookingHotelPageObjects.CHECK_IN;
                break;
            case "City Name":
                button = BookingHotelPageObjects.CITY_NAME;
                break;
            case "Login Button":
                button = PHPTravelPageObjects.LOGIN_BUTTON;
                break;
            default:
                throw new Exception("There is no button type: " + buttonType);
        }

        WaitUntil.the(button, isVisible()).forNoMoreThan(25).seconds();
        return Task.where("{0} click " + buttonType + "button",
                Click.on(button));
    }
    public static Performable artistList() {
        return Task.where("{0} click artist",
                Click.on(HireArtistPageObjects.ARTIST_LIST)
        );
    }
}
