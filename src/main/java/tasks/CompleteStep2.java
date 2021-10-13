package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.CompleteStep2Page;

public class CompleteStep2 implements Task {
    /*private String city;
    private String postalcode;
    private String country;*/
    public static CompleteStep2 data() {
        return Tasks.instrumented(CompleteStep2.class);
    }

    public CompleteStep2() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(CompleteStep2Page.BUTTON_DEVICES)
        );
    }
}
