package starter.steps.categoryProd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.categoryProd.GetCategProdIdPage;

public class GetCategProdIdStep {
    @Steps
    GetCategProdIdPage getCategProdIdPage;

    @Given("set url get category product valid")
    public void setUrlGetCategoryProductValid() {
        getCategProdIdPage.setUrlGetProId();
    }

    @When("I input valid id")
    public void iInputValidId() {
        getCategProdIdPage.reqGetProdIdVal();
    }

    @Given("set url get category product invalid")
    public void setUrlGetCategoryProductInvalid() {
        getCategProdIdPage.setUrlGetInvalidProd();
    }

    @When("I input invalid id")
    public void iInputInvalidId() {
        getCategProdIdPage.reqGetProdIdInval();
    }

    @Then("I get 404 Not Found")
    public void iGet404NotFound() {
        getCategProdIdPage.get404();
    }
}
