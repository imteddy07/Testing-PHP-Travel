package Potentivio.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://fe-potentivio.vercel.app/register-owner")
public class PotentivioPIMPageObjects extends PageObject {
    public static Target SUCCESS_REGISTER = Target.the("Sukses").locatedBy("#swal2-title");
}
