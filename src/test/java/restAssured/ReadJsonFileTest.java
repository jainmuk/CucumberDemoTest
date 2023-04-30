package restAssured;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonFileTest {

    public static void main(String args[]){
        try {
            FileReader fr = new FileReader("emp.json");
            JSONParser jsonParser = new JSONParser();
            JSONArray employeeList = (JSONArray) jsonParser.parse(fr);
            employeeList.forEach(emp -> parseEmployeeObject((JSONObject)emp));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void parseEmployeeObject(JSONObject employee){
        JSONObject employeeObject = (JSONObject) employee.get("employee");
        String firstName = (String)employeeObject.get("firstname");
        String employer = (String)employeeObject.get("Employer");
        String lastName = (String)employeeObject.get("lastname");
        System.out.println(firstName + employer + lastName );
    }
}
