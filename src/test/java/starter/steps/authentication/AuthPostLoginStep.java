package starter.steps.authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.authentication.AuthPostLoginPage;

public class AuthPostLoginStep {
    @Steps
    AuthPostLoginPage loginPage;

    @Given("set url login")
    public void setUrlLogin() {
        loginPage.getUrlLogin();
    }

//    @When("input data valid email and valid password")
//    public void inputDataValidEmailandValidPassword() {
//        loginPage.getDataLoginValid();
//    }
//
//    @When("input data valid email and invalid password")
//    public void inputDataValidEmailAndInvalidPassword() {
//        loginPage.getValEmInvalPass();
//    }
//
//    @When("input data invalid email and valid password")
//    public void inputDataInvalidEmailAndValidPassword() {
//        loginPage.getInvalEmValPass();
//    }
//
//    @When("input data invalid email and invalid password")
//    public void inputDataInvalidEmailAndInvalidPassword() {
//        loginPage.getInvalEmInvalPass();
//    }
//
//    @When("no input")
//    public void noInput() {
//    }


    @When("input email {string} password {string}")
    public void inputEmailPassword(String email, String pass) {
        loginPage.getDataLogin(email, pass);
    }

    @Then("I get result {string}")
    public void iGetResult(String result) {
        if (result.equals("200")){
            loginPage.getResult200();
        }
        else if (result.equals("400")){
            loginPage.getResult400();
        }
    }
}
