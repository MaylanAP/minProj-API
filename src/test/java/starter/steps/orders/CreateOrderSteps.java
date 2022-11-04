package starter.steps.orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import net.thucydides.core.annotations.Steps;
import starter.pages.orders.CreateOrderPage;

public class CreateOrderSteps {
    @Steps
    CreateOrderPage createOrderPage;

    @Given("set url create order")
    public void setUrlCreateOrder() {
        createOrderPage.setUrlCreateOrder();
    }

    @When("input {int} product id and {int} quantity")
    public void inputProductIdAndQuantity(Integer id, Integer qty) {
        createOrderPage.bodyProduct(id, qty);
        createOrderPage.reqCreateDataOrder();
    }

    @Then("i get {string} result")
    public void iGetResult(String result) {
        if (result.equals("200")){
            createOrderPage.get200();
        }
        else if (result.equals("400")){
            createOrderPage.get400();
        }
    }

    @Given("set url get all order")
    public void setUrlGetAllOrder() {
        createOrderPage.setUrlGetAllOrder();
    }

    @When("click get all order")
    public void clickGetAllOrder() {
        createOrderPage.reqGetAllOrder();
    }


    @Given("set url get a order")
    public void setUrlGetAOrder() {
        createOrderPage.setUrlGetAorder();
    }

    @When("click get a order")
    public void clickGetAOrder() {
        createOrderPage.reqGetAOrder();
    }
}
