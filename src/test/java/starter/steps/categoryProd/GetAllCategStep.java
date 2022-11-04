package starter.steps.categoryProd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.categoryProd.GetAllCategPage;

public class GetAllCategStep {
    @Steps
    GetAllCategPage getAllCategPage;

    @Given("set url get all category")
    public void setUrlGetAllCategory() {
        getAllCategPage.setUrlGetall();
    }

    @When("click get")
    public void clickGet() {
        getAllCategPage.reqGetALlCateg();
    }
}
