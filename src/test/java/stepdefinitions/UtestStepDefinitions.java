package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.SingUptData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;
import userinterface.CompleteStep1Page;
import userinterface.CompleteStep3Page;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Gustavo wants to create a new user in Utest page$")
    public void thanGustavoWantsToCreateANewUserInUtestPage(List<SingUptData> singUptData) throws Exception{
        OnStage.theActorCalled("Gustavo").wasAbleTo(OpenUp.thePage(),
                SingUp.onThePage());
    }

    @When("^he complete all data for register as a new user in Utest page$")
    public void heCompleteAllDataForRegisterAsANewUserInUtestPage(List<SingUptData> singUptData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteStep1.data(
                singUptData.get(0).getStrFirstName(),singUptData.get(0).getStrLastname(),
                singUptData.get(0).getStrEmail(),singUptData.get(0).getStrMonth(),
                singUptData.get(0).getStrDay(),singUptData.get(0).getStrYear()));
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteStep2.data());
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteStep3.data());
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteStep4.data(singUptData.get(0).getStrPassword(),
                singUptData.get(0).getStrConfirmPassword()));
    }

    @Then("^he can see at the page a welcome message$")
    public void heCanSeeAtThePageAWelcomeMessage(List<SingUptData> singUptData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(singUptData.get(0).getStrConfirmMessage())));
    }
}
