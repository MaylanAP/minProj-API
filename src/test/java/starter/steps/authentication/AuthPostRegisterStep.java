package starter.steps.authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.authentication.AuthPostRegisterPage;

public class AuthPostRegisterStep {
    @Steps
    AuthPostRegisterPage registerPage;

    @Given("set url registration")
    public void setUrlRegistration() {
        registerPage.getUrlRegis();
    }

    @When("input email password and fullname valid")
    public void inputEmailPasswordAndFullname() {
        registerPage.reqValRegis();
    }

    @Then("I get 200 OK")
    public void iGet200OK() {
        registerPage.get200OK();
    }

    @Then("I get 400 Bad Request")
    public void iGet400BadRequest() {
        registerPage.get400BadReq();
    }

    @When("input email password and fullname invalid")
    public void inputEmailPasswordAndFullnameInvalid() {
        registerPage.getDataRegisInvalid();
    }
}
