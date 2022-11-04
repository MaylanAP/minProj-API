package starter.steps.product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.product.ProductPage;

public class CreateProductStep {
    @Steps
    ProductPage productPage;

    @Given("set url product")
    public void setUrlProduct() {
        productPage.getUrlProduct();
    }

    @When("input {string} name {string} desc {int} price and categories {int}")
    public void inputIdDescAndCategories(String name, String desc, Integer price, Integer categ) {
        productPage.getDataInProduct(name, desc, price, categ);
    }

    @Then("I get the {string} result")
    public void iGetThe(String result) {
        if (result.equals("get 200")){
            productPage.get200OK();
        }
        else if (result.equals("get 500")){
            productPage.get500();
        }
    }

}
