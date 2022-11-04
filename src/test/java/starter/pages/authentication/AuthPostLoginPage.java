package starter.pages.authentication;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;


public class AuthPostLoginPage {

    private String urlLogin;
    public void getUrlLogin(){
        urlLogin = "https://alta-shop.herokuapp.com/api/auth/login";
    }

//    //valid email and valid password
//    public JSONObject dataLoginValid(){
//        JSONObject body = new JSONObject();
//        body.put("email","map2@mail.com");
//        body.put("password","akuncobaku");
//        return body;
//    }
//    public void getDataLoginValid(){
//        given().body(dataLoginValid().toJSONString());
//        when().post(urlLogin);
//    }
//
//    //valid email and invalid password
//    public JSONObject dataLogValEmailInvalPass(){
//        JSONObject body = new JSONObject();
//        body.put("email","may2@mail.com");
//        body.put("password","akunaku");
//        return body;
//    }
//    public void getValEmInvalPass(){
//        given().body(dataLogValEmailInvalPass().toJSONString());
//        when().post(urlLogin);
//    }
//
//    //invalid email and valid password
//    public JSONObject dataLogInvalEmValPass(){
//        JSONObject body = new JSONObject();
//        body.put("email","may@gmail.com");
//        body.put("password","akuncobaku");
//        return body;
//    }
//    public void getInvalEmValPass(){
//        given().body(dataLogInvalEmValPass().toJSONString());
//        when().post(urlLogin);
//    }
//
//    //invalid email and invalid password
//    public JSONObject dataLogInvalEmInvalPass(){
//        JSONObject body = new JSONObject();
//        body.put("email","may@gmail.com");
//        body.put("password","akunaku");
//        return body;
//    }
//    public void getInvalEmInvalPass(){
//        given().body(dataLogInvalEmInvalPass().toJSONString());
//        when().post(urlLogin);
//    }


    public JSONObject dataLogin(String email, String pass){
        JSONObject body = new JSONObject();
        body.put("email", email);
        body.put("password", pass);
        return body;
    }
    public void getDataLogin(String email, String pass){
        given().body(dataLogin(email, pass).toJSONString());
        when().post(urlLogin);
    }

    public void getResult200(){
        then().statusCode(200);
    }
    public void getResult400(){
        then().statusCode(400);
    }

}
