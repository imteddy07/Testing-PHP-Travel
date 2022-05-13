package Potentivio.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://fe-potentivio.vercel.app/register-owner")
public class PotentivioRegisterPageObjects extends PageObject {
    public static Target REGISTER_CAFE_BUTTON = Target.the("register cafe owner")
            .locatedBy(".button-login");
    public static Target CAFE_NAME_FIELD = Target.the("Cafe Name field")
            .locatedBy("#cafeName");
    public static Target OWNER_CAFE_FIELD = Target.the("Owner Name field")
            .locatedBy("#ownerName");
    public static Target EMAIL_CAFE_FIELD = Target.the("Email Name field")
            .locatedBy("#email");
    public static Target PASSWORD_CAFE_FIELD = Target.the("Password Cafe field")
            .locatedBy("#password");
    public static Target ADDRESS_CAFE_FIELD = Target.the("Address Cafe field")
            .locatedBy("#address");
    public static Target SUCCESS_REGISTER = Target.the("Register Success")
            .locatedBy("#address");
}
