package PHPTravel.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://phptravels.net/flights")
public class BookingFlightPageObjects extends PageObject {
    public static Target FLYING_FROM = Target.the("Flying From")
            .locatedBy("#autocomplete");
    public static Target TO_DESTINATION = Target.the("To Destination")
            .locatedBy("#autocomplete2");
    public static Target DEPARTURE= Target.the("Departure")
            .locatedBy("#depature");
    public static Target SEARCH_FLIGHT= Target.the("Search Flight")
            .locatedBy("#flights-search");
    public static Target PASSENGER= Target.the("Passenger")
            .locatedBy("//span[@class=\"guest_flights d-block text-center\"]");
}
