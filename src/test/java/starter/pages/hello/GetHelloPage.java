package starter.pages.hello;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

public class GetHelloPage {

    private String token ="Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImluaSBha3VuIGFrdSIsIkVtYWlsIjoibWFwMkBtYWlsLmNvbSJ9.zyH-BUNrwfdj4uBu2MDuf1nTWaEyYUrLhfAyH_sZBCE";
    private String urlGetHello;
    public void setUrlGetHello(){
        urlGetHello = "https://alta-shop.herokuapp.com/api/hello";
    }

    public void reqGetHello(){
        given().header("Authorization ",token)
                .header("Content-Type","application/json");
        when().get(urlGetHello);
    }


}
