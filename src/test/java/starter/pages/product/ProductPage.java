package starter.pages.product;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.*;

public class ProductPage {

    private String urlProduct;
    public void getUrlProduct(){
        urlProduct = "https://alta-shop.herokuapp.com/api/products";
    }
    private String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImluaSBha3VuIGFrdSIsIkVtYWlsIjoibWFwMkBtYWlsLmNvbSJ9.zyH-BUNrwfdj4uBu2MDuf1nTWaEyYUr";

    private JSONObject body = new JSONObject();

    public JSONObject validInputProduct(String name, String desc, Integer price, Integer categ){
        List<Integer> category = new ArrayList<>();
        body.put("name",name);
        body.put("description",desc);
        body.put("price",price);
        category.add(categ);
        body.put("categories",category);
        return body;
    }
    public void getDataInProduct(String name, String desc, Integer price, Integer categ){
        given().header("Authorization", token)
                .body(validInputProduct(name, desc, price, categ));
        when().post(urlProduct);
    }

    public void get200OK(){
        then().statusCode(200);
    }
    public void get500(){
        then().statusCode(500);
    }


}
