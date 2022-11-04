package starter.pages.product;

import static net.serenitybdd.rest.SerenityRest.*;

public class GetProductPage {

    private String urlGetProduct;
    public void setUrlGetProduct(){
        urlGetProduct = "https://alta-shop.herokuapp.com/api/products/330";
    }

    private String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImluaSBha3VuIGFrdSIsIkVtYWlsIjoibWFwMkBtYWlsLmNvbSJ9.zyH-BUNrwfdj4uBu2MDuf1nTWaEyYUrLhfAyH_sZBCE";

    public void reqGetIdProd(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json");
        when().get(urlGetProduct);
    }

}
