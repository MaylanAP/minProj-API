package starter.pages.product;

import static net.serenitybdd.rest.SerenityRest.given;

public class DeleteProductPage {

    private String urlDelProduct;
    public void getUrlDelProduct(){
        urlDelProduct = "https://alta-shop.herokuapp.com/api/products/50";
    }
    private String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImluaSBha3VuIGFrdSIsIkVtYWlsIjoibWFwMkBtYWlsLmNvbSJ9.zyH-BUNrwfdj4uBu2MDuf1nTWaEyYUrLhfAyH_sZBCE";

    public void reqDataDelete(){
        given().header("Authorization",token)
                .when().delete(urlDelProduct);
    }


}
