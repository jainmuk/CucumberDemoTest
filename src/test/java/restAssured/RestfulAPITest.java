package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestfulAPITest {

    @Test(description = "Rest API Test")
    public void testRestAPIGet(){
            RestAssured.baseURI ="https://api.apilayer.com/";
            RequestSpecification requestSpecification = given();
            requestSpecification.header("apikey","t5sggbbxyKF2lk8vL93CwR7ixnlbYat2");
            Response response = requestSpecification.get("bank_data/iban_validate?iban_number=DE89370400440532013000");
//            JSONParser jsonParser = new JSONParser();
//            try {
//                JSONObject jsonObject = (JSONObject) jsonParser.parse(response.asString());
//                JSONObject iban_data = (JSONObject) jsonObject.get("iban_data");
//                String country = (String) iban_data.get("country");
//                Assert.assertEquals("Country is not matched","Germany",country);
//            } catch (ParseException e) {
//                throw new RuntimeException(e);
//            }



                    response.then().statusCode(200)
                    .assertThat().body("iban",equalTo("DE89370400440532013000"))
                    .assertThat().body("message",equalTo("IBAN number is valid."))
                    .assertThat().body("valid",equalTo(true))
                    .assertThat().body("country_iban_example",equalTo("DE89370400440532013000"))
                            .assertThat().body("iban_data.country",equalTo("Germany"));

        }

    @Test
    public void whenUseMultiplePathParam_thenOK() {
        given().pathParams("owner", "eugenp", "repo", "tutorials")
                .when().get("/repos/{owner}/{repo}")
                .then().statusCode(200);

        given().pathParams("owner", "eugenp")
                .when().get("/repos/{owner}/{repo}","tutorials")
                .then().statusCode(200);
    }

    @Test
    public void whenUseQueryParam_thenOK() {
        given().queryParam("q", "john").when().get("/search/users")
                .then().statusCode(200);

        given().param("q", "john").when().get("/search/users")
                .then().statusCode(200);
    }

}
