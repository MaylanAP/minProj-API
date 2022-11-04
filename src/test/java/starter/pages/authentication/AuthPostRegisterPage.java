package starter.pages.authentication;

import org.json.simple.JSONObject;

import java.util.Random;

import static net.serenitybdd.rest.SerenityRest.*;

public class AuthPostRegisterPage {

    private String urlRegis;
    public void getUrlRegis(){
        urlRegis = "https://alta-shop.herokuapp.com/api/auth/register";
    }
    public JSONObject dataRegisVal() {
        JSONObject body = new JSONObject();
        Random email = new Random();
        int rand = email.nextInt();
        body.put("email","may" + rand + "@mail.com");
        body.put("password","akuncoba1");
        body.put("fullname", "ini akun ku");
        return body;
    }
    public void reqValRegis(){
        given().body(dataRegisVal().toJSONString());
        when().post(urlRegis);
    }

    public JSONObject dataRegisInval(){
        JSONObject body = new JSONObject();
        body.put("email","map2@mail.com");
        body.put("password","akuncoba1");
        body.put("fullname","ini akun ku");
        return body;
    }
    public void getDataRegisInvalid(){
        given().body(dataRegisInval().toJSONString());
        when().post(urlRegis);
    }

    public void get200OK(){
        then().statusCode(200);
    }

    public void get400BadReq(){
        then().statusCode(400);
    }


}
