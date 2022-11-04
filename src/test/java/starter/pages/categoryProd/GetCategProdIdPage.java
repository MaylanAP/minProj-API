package starter.pages.categoryProd;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetCategProdIdPage {

    private String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImluaSBha3VuIGFrdSIsIkVtYWlsIjoibWFwMkBtYWlsLmNvbSJ9.zyH-BUNrwfdj4uBu2MDuf1nTWaEyYUrLhfAyH_sZBCE";

    private String urlGetProId;
    public void setUrlGetProId(){
        urlGetProId = "https://alta-shop.herokuapp.com/api/categories/351";
    }
    public void reqGetProdIdVal(){
        given().header("Authorization",token)
                .when().get(urlGetProId);
    }

    private String urlGetInvalidProd;
    public void setUrlGetInvalidProd(){
        urlGetInvalidProd = "https://alta-shop.herokuapp.com/api/categories/0";
    }
    public void reqGetProdIdInval(){
        given().header("Authorization",token)
                .when().get(urlGetInvalidProd);
    }

    public void get404(){
        then().statusCode(404);
    }

}
