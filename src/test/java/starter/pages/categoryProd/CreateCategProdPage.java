package starter.pages.categoryProd;

import org.json.simple.JSONObject;

import java.util.Random;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

public class CreateCategProdPage {

    private String urlCategProd;
    public void setUrlCategProd(){
        urlCategProd = "https://alta-shop.herokuapp.com/api/categories";
    }
    private String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImluaSBha3VuIGFrdSIsIkVtYWlsIjoibWFwMkBtYWlsLmNvbSJ9.zyH-BUNrwfdj4uBu2MDuf1nTWaEyYUrLhfAyH_sZBCE";

    public JSONObject dataValidCateg(){
        JSONObject body = new JSONObject();
        Random random = new Random();
        int name = random.nextInt();
        body.put("name","laptop" + name);
        body.put("description","for school purpose");
        return body;
    }
    public void getDataValidCateg(){
        given().header("Authorization",token)
                .header("Content-Type","application/json")
                .body(dataValidCateg().toJSONString());
        when().post(urlCategProd);
    }
    public JSONObject dataInvalidCateg(){
        JSONObject body = new JSONObject();
        Random random = new Random();
        int name = random.nextInt();
        body.put("name",random);
        body.put("description","for school purpose");
        return body;
    }
    public void getDataInvalidCateg(){
        given().header("Authorization",token)
                .header("Content-Type","application/json")
                .body(dataInvalidCateg().toJSONString());
        when().post(urlCategProd);
    }


}
