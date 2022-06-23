package tasks;

import PHPTravel.pageobjects.BookingFlightPageObjects;
import PHPTravel.pageobjects.BookingHotelPageObjects;
import PHPTravel.pageobjects.PHPTravelPageObjects;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;


public class InputText {
    public static Performable onField(String fieldType, String value) throws Exception {
        Target field = null;

        switch (fieldType) {
            case "To Destination":
                field = BookingFlightPageObjects.TO_DESTINATION;
                break;
            case "Flying From":
                field = BookingFlightPageObjects.FLYING_FROM;
                break;
            case "City Field":
                field = BookingHotelPageObjects.CITY_FIELD;
                break;
            case "PHP Email":
                field = PHPTravelPageObjects.PHP_EMAIL_FIELD;
                break;
            case "PHP Password":
                field = PHPTravelPageObjects.PHP_PASSWORD_FIELD;
                break;
            default:
                throw new Exception("There is no field type: " + fieldType);
        }

        return Task.where("{0} input: '" + value + "'",
                Enter.theValue(value)
                        .into(field));
    }
}
