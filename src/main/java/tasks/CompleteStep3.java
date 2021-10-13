package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CompleteStep3Page;

public class CompleteStep3 implements Task {
    private String pcOS;
    private String pcVersion;
    private String pcLenguagen;
    private String Mobile;
    private String mobileModel;
    private String mobileOs;

    public CompleteStep3() {

    }

    public static CompleteStep3 data() {
        return Tasks.instrumented(CompleteStep3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CompleteStep3Page.BUTTON_LAST_STEP)

        );
    }
}
