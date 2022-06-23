package PHPTravel.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.phptravels.net/hotels")
public class BookingHotelPageObjects extends PageObject {
    public static Target CITY_NAME = Target.the("City Name")
            .locatedBy("#select2-hotels_city-container");
    public static Target CITY_FIELD = Target.the("City Field")
            .locatedBy(".select2-search__field");
    public static Target CHECK_IN = Target.the("Check In")
            .locatedBy("#checkin");
    public static Target CHECK_OUT = Target.the("Check Out")
            .locatedBy("#checkout");
    public static Target SUBMIT = Target.the("Submit")
            .locatedBy("#submit");

}
