package restAssured;

import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;
import gherkin.deps.com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonParserTest {

    public static void main(String args[]){
        RestAssured.baseURI = "https://api.apilayer.com/bank_data/all?per_page=200&page=1&country=IN";
        RequestSpecification request = RestAssured.given();

        request.header("apikey", "t5sggbbxyKF2lk8vL93CwR7ixnlbYat2");

        Response res = request.get();
        String httpRes = res.asString();
        System.out.println(httpRes);

        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = jsonParser.parse(res.asString()).getAsJsonObject();
        JsonArray jsonArray = jsonObject.getAsJsonArray("data");
        JsonObject iban_data = jsonArray.get(0).getAsJsonObject().get("iban_data").getAsJsonObject();

        System.out.println(iban_data.get("iban").getAsString() );

    }
}
