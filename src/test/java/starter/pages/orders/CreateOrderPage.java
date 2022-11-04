package starter.pages.orders;

import io.cucumber.java.sl.In;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.*;

public class CreateOrderPage {

    private String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImluaSBha3VuIGFrdSIsIkVtYWlsIjoibWFwMkBtYWlsLmNvbSJ9.zyH-BUNrwfdj4uBu2MDuf1nTWaEyYUrLhfAyH_sZBCE";
    private String urlCreateOrder;
    public void setUrlCreateOrder(){
        urlCreateOrder = "https://alta-shop.herokuapp.com/api/orders";
    }

    List<JSONObject> data = new ArrayList<>();

    public void bodyProduct(Integer id, Integer qty){
        JSONObject body = new JSONObject();
        body.put("product_id", id);
        body.put("quantity", qty);
        data.add(body);
    }

    public void reqCreateDataOrder(){
        given().header("Authorization",token)
                .header("Content-Type"," application/json")
                .body(data);
        when().post(urlCreateOrder);
    }


    public void get200(){
        then().statusCode(200);
    }
    public void get400(){
        then().statusCode(400);
    }

    private String urlGetAllOrder;
    public void setUrlGetAllOrder(){
        urlGetAllOrder = "https://alta-shop.herokuapp.com/api/orders";
    }
    public void reqGetAllOrder(){
        given().header("Authorization",token)
                .header("Content-Type","application/json");
        when().get(urlGetAllOrder);
    }

    private String urlGetAorder;
    public void setUrlGetAorder(){
        urlGetAorder = "https://alta-shop.herokuapp.com/api/orders/828";
    }
    public void reqGetAOrder(){
        given().header("Authorization",token)
                .header("Content-Type","application/json")
                .when().get(urlGetAorder);
    }


}
