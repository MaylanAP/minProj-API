package starter.pages.categoryProd;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetAllCategPage {

    private String urlGetall;
    public void setUrlGetall(){
        urlGetall = "https://alta-shop.herokuapp.com/api/categories";
    }
    private String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImluaSBha3VuIGFrdSIsIkVtYWlsIjoibWFwMkBtYWlsLmNvbSJ9.zyH-BUNrwfdj4uBu2MDuf1nTWaEyYUrLhfAyH_sZBCE";

    public void reqGetALlCateg(){
        given().header("Authorization",token)
                .when().get(urlGetall);
    }

}
