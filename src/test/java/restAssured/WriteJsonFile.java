package restAssured;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJsonFile {

    public static void main(String args[]){
        JSONObject emp1 = new JSONObject();
        emp1.put("firstname","Mukul");
        emp1.put("lastname","Jain");
        emp1.put("Employer","Nagarro");

        JSONObject emp2 = new JSONObject();
        emp2.put("firstname","Shivani");
        emp2.put("lastname","Jain");
        emp2.put("Employer","CA Sodhiya");

        JSONObject employee1 = new JSONObject();
        employee1.put("employee",emp1);

        JSONObject employee2 = new JSONObject();
        employee2.put("employee",emp2);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(employee1);
        jsonArray.add(employee2);

        try {
            FileWriter fw = new FileWriter("emp.json");
            fw.write(jsonArray.toJSONString());
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
