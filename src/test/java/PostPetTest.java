import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.Date;

import static com.jayway.restassured.RestAssured.get;

public class PostPetTest {


    @Test
    public void post()
    {


        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 153);
        requestBody.put("name", "Mali");

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestBody.toString());
        Response response = request.post("https://petstore.swagger.io/v2/pet");

        System.out.println(response.getBody().asString());

    }




    @Test
    public void getRequestExampleTest() throws JSONException {
        Response response = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
        System.out.println(response.getBody().asString());

    }




}
