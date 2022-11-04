package starter.steps.authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.authentication.AuthGetUserPage;

public class AuthGetUserStep {
    @Steps
    AuthGetUserPage getUserPage;

    @Given("set url get user")
    public void setUrlGetUser() {
        getUserPage.urlGetUser();
    }

    @When("I request list user valid")
    public void iRequestListUserValid() {
        getUserPage.requestListUser();
    }

    @When("I request list user invalid")
    public void iRequestListUserInvalid() {
        getUserPage.getUserInval();
    }

    @Then("I get 401 Unauthorization")
    public void iGetUnauthorization() {
        getUserPage.get401();
    }

}
