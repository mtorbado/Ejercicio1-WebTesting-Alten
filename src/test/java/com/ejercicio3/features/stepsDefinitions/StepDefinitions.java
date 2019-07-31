package com.ejercicio3.features.stepsDefinitions;

import com.ejercicio3.features.serenitySteps.ActServiceDefinition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class StepDefinitions {

    @Steps
    ActServiceDefinition steps;

    @Given("^The login web page is accessible$")
    public void theLoginWebPageIsAccessible() throws IOException {
        steps.openLoginPage();
    }

    @When("^I introduce the administrator user & password$")
    public void iIntroduceTheAdministratorUserPassword() {
        steps.login();
    }

    @Then("^The \"([^\"]*)\" page is shown$")
    public void thePageIsShown(String arg0) throws InterruptedException {
        steps.pageShown();
    }

    @And("^The \"([^\"]*)\" button is enabled$")
    public void theButtonIsEnabled(String arg0)  {
        steps.editProfileButtonIsEnabled();
    }
}
