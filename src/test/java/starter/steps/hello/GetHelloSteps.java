package starter.steps.hello;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.hello.GetHelloPage;

public class GetHelloSteps {
    @Steps
    GetHelloPage getHelloPage;

    @Given("set url hello valid")
    public void setUrlHelloValid() {
        getHelloPage.setUrlGetHello();
    }

    @When("get hello valid")
    public void getHelloValid() {
        getHelloPage.reqGetHello();
    }
}
