package PHPTravel.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://www.phptravels.net/login")
public class PHPTravelPageObjects extends PageObject{
    public static Target PHP_EMAIL_FIELD = Target.the("email php field")
            .locatedBy("//input[contains(@placeholder, \"Email\")]");
    public static Target PHP_PASSWORD_FIELD = Target.the("password php field")
            .locatedBy("//input[contains(@placeholder, \"Password\")]");
    public static Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']");

}
