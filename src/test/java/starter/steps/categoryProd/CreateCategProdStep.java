package starter.steps.categoryProd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.categoryProd.CreateCategProdPage;

public class CreateCategProdStep {
    @Steps
    CreateCategProdPage categoryProdPage;

    @Given("set url create category product")
    public void setUrlCreateCategoryProduct() {
        categoryProdPage.setUrlCategProd();
    }

    @When("input name and description valid")
    public void inputNameAndDescriptionValid() {
        categoryProdPage.getDataValidCateg();
    }

    @When("input name and description invalid")
    public void inputNameAndDescriptionInvalid() {
        categoryProdPage.getDataInvalidCateg();
    }

}
