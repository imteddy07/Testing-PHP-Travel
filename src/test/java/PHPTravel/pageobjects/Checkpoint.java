package PHPTravel.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Checkpoint extends PageObject {
    public static Target WELCOME_BACK = Target.the("Welcome Back")
            .locatedBy("//span[text()=\"Welcome Back\"]");
}
