package starter.steps.product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.product.DeleteProductPage;

public class DeleteProductStep {
    @Steps
    DeleteProductPage deleteProductPage;

    @Given("set url delete product")
    public void setUrlDeleteProduct() {
        deleteProductPage.getUrlDelProduct();
    }

    @When("delete product with id")
    public void deleteProductWithId() {
        deleteProductPage.reqDataDelete();
    }
}
