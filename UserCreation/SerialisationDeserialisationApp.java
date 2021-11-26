import Test.requestModels.UserCreateRequestModel;
import Test.responseModels.UserCreateResponse;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import static io.restassured.RestAssured.given;

public class SerialisationDeserialisationApp {

    @Test
    public void CreateUser() {

        UserCreateRequestModel requestModelUsingArray = new UserCreateRequestModel();
        ArrayList<UserCreateRequestModel> requestModelList = new ArrayList<UserCreateRequestModel>();
        requestModelUsingArray.setId(1);
        requestModelUsingArray.setUsername("haritha123");
        requestModelUsingArray.setFirstname("haritha");
        requestModelUsingArray.setLastname("laxmi");
        requestModelUsingArray.setEmail("jar@jmail.com");
        requestModelUsingArray.setPassword("o39ur@");
        requestModelUsingArray.setPhone("998763");
        requestModelUsingArray.setUserStatus(23);
        requestModelList.add(requestModelUsingArray);

        DoSerialisation responseReceived=
                given()
                        .contentType(ContentType.JSON)
                        .body(requestModelList)
                        .when().post("https://petstore.swagger.io/v2/user/createWithArray")
                        .then()
                        .extract().response().as(DoSerialisation.class);

        System.out.println(responseReceived.getCode());
        Assert.assertEquals(responseReceived.getCode(),200);


        Assert.assertEquals(responseReceived.getResponseMessage(),"ok");

        System.out.println(responseReceived);

    }

    @Test
    public void CreateUserUsingArray() {

        UserCreateRequestModel requestModelUsingArray = new UserCreateRequestModel();
        ArrayList<UserCreateRequestModel> requestModelList = new ArrayList<UserCreateRequestModel>();
        requestModelUsingArray.setId(1);
        requestModelUsingArray.setUsername("haritha123");
        requestModelUsingArray.setFirstname("haritha");
        requestModelUsingArray.setLastname("laxmi");
        requestModelUsingArray.setEmail("jar@jmail.com");
        requestModelUsingArray.setPassword("o39ur@");
        requestModelUsingArray.setPhone("998763");
        requestModelUsingArray.setUserStatus(23);
        requestModelList.add(requestModelUsingArray);

        requestModelUsingArray.setId(12);
        requestModelUsingArray.setUsername("yellow123");
        requestModelUsingArray.setFirstname("yellow");
        requestModelUsingArray.setLastname("color");
        requestModelUsingArray.setEmail("yal@yahoo.com");
        requestModelUsingArray.setPassword("9%3h2&");
        requestModelUsingArray.setPhone("9372746");
        requestModelUsingArray.setUserStatus(230);
        requestModelList.add(requestModelUsingArray);

        DoSerialisation responseReceived=
                given()
                        .contentType(ContentType.JSON)
                        .body(requestModelList)
                        .when().post("https://petstore.swagger.io/v2/user/createWithArray")
                        .then()
                        .extract().response().as(DoSerialisation.class);

        System.out.println(responseReceived.getCode());
        Assert.assertEquals(responseReceived.getCode(),200);


        Assert.assertEquals(responseReceived.getResponseMessage(),"ok");

        System.out.println(responseReceived);

    }



}


