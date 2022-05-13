package tasks;

import Potentivio.pageobjects.PotentivioLoginPageObjects;
import Potentivio.pageobjects.PotentivioRegisterPageObjects;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;


public class InputText {
    public static Performable onField(String fieldType, String value) throws Exception {
        Target field = null;

        switch (fieldType) {
            case "Cafe Owner Email":
                field = PotentivioLoginPageObjects.EMAIL_CAFE_FIELD;
                break;
            case "Cafe Owner Password":
                field = PotentivioLoginPageObjects.PASSWORD_CAFE_FIELD;
                break;
            case "Cafe Name":
                field = PotentivioRegisterPageObjects.CAFE_NAME_FIELD;
                break;
            case "Owner Cafe":
                field = PotentivioRegisterPageObjects.OWNER_CAFE_FIELD;
                break;
            case "Email Cafe":
                field = PotentivioRegisterPageObjects.EMAIL_CAFE_FIELD;
                break;
            case "Password Cafe":
                field = PotentivioRegisterPageObjects.PASSWORD_CAFE_FIELD;
                break;
            case "Address Cafe":
                field = PotentivioRegisterPageObjects.ADDRESS_CAFE_FIELD;
                break;
            default:
                throw new Exception("There is no field type: " + fieldType);
        }

        return Task.where("{0} input: '" + value + "'",
                Enter.theValue(value)
                        .into(field));
    }
}
