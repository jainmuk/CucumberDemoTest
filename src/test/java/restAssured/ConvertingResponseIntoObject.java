package restAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Employee;

import java.io.FileWriter;
import java.io.IOException;

public class ConvertingResponseIntoObject {

    public static void main(String args[]){
        RestAssured.baseURI = "https://api.apilayer.com/";
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("apikey","t5sggbbxyKF2lk8vL93CwR7ixnlbYat2");
        Response response = requestSpecification.get("currency_data/live?source=GBP&currencies=INR");
        response.then().statusCode(200);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
          Employee employee = objectMapper.readValue(response.body().asString(), Employee.class);
          FileWriter fw = new FileWriter("emp.json");
          objectMapper.writeValue(fw,employee);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
