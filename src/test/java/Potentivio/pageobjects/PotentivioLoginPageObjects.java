package Potentivio.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://fe-potentivio.vercel.app/")
public class PotentivioLoginPageObjects extends PageObject {
    public static Target CAFE_OWNER_BUTTON = Target.the("Cafe Owner")
            .locatedBy("//button[text()='Cafe Owner']");
    public static Target EMAIL_CAFE_FIELD = Target.the("email cafe field")
            .locatedBy("#exampleInputEmail1");
    public static Target PASSWORD_CAFE_FIELD = Target.the("password cafe field")
            .locatedBy("#exampleInputPassword1");
    public static Target LOGIN_CAFE_BUTTON = Target.the("login as cafe owner button")
            .locatedBy("//button[text()='Log In to My Acount']");
}
