package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.CompleteStep1Page;

public class CompleteStep1 implements Task {
        private String fname;
        private String lname;
        private String email;
        private String month;
        private String day;
        private String year;


    public static CompleteStep1 data(String fname, String lname, String email,String month, String day, String year) {
        return Tasks.instrumented(CompleteStep1.class,fname,lname,email, month, day, year);
    }

    public CompleteStep1(String fname, String lname, String email,String month, String day, String year) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(fname).into(CompleteStep1Page.INPUT_FIRST_NAME),
                Enter.theValue(lname).into(CompleteStep1Page.INPUT_LAST_NAME),
                Enter.theValue(email).into(CompleteStep1Page.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(month).from(CompleteStep1Page.SELECT_MONTH),
                SelectFromOptions.byVisibleText(day).from(CompleteStep1Page.SELECT_DAY),
                SelectFromOptions.byVisibleText(year).from(CompleteStep1Page.SELECT_YEAR),
                Click.on(CompleteStep1Page.BUTTON_NEXT)
        );
    }
}
