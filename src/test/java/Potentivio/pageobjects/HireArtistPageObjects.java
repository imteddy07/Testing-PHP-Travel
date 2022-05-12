package Potentivio.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://fe-potentivio.vercel.app/owner")
public class HireArtistPageObjects extends PageObject {
    public static Target ARTIST_LIST = Target.the("artist list")
            .locatedBy("//a[@href='/owner/detail-owner/116']");
}
