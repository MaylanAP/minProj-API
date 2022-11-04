package starter.steps.product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.product.GetProductPage;

public class GetProductStep {
    @Steps
    GetProductPage productGetPage;

    @Given("set url get product")
    public void setUrlGetProduct() {
        productGetPage.setUrlGetProduct();
    }

    @When("input id product")
    public void inputIdProduct() {
        productGetPage.reqGetIdProd();
    }

}
