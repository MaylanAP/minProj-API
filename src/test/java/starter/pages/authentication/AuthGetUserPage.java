package starter.pages.authentication;

import static net.serenitybdd.rest.SerenityRest.*;

public class AuthGetUserPage {

    private String urlGetUser;
    public void urlGetUser(){
        urlGetUser = "https://alta-shop.herokuapp.com/api/auth/info";
    }

    private String tokenVal = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImluaSBha3VuIGFrdSIsIkVtYWlsIjoibWFwMkBtYWlsLmNvbSJ9.zyH-BUNrwfdj4uBu2MDuf1nTWaEyYUrLhfAyH_sZBCE";

    public void requestListUser(){
        given().header("Authorization", tokenVal)
                .header("Content-Type","application/json");
        when().get(urlGetUser);
    }

    private String tokenInval = "Bearer a";
    public void getUserInval(){
        given().header("Authorization", tokenInval);
        when().get(urlGetUser);
    }
    public void get401(){
        then().statusCode(401);
    }

}
