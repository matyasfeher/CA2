/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Person;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.parsing.Parser;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import static rest.PersonService.gson;

/**
 *
 * @author Plamen
 */
public class PersonServiceIntegrationTest {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    
    public PersonServiceIntegrationTest() {
    }
    @BeforeClass
    public static void setUpBeforeAll() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/CA2";
        RestAssured.defaultParser = Parser.JSON;
    }

    @Before
    public void setUp() {
        
    }
    
    
    @Test
    public void serverIsRunning() {
        given().
                when().get().
                then().
                statusCode(200);
    }
    
    
    
//    @Test
//    public void testAddNewUser() {
//        PersonService service = new PersonService();
//        Person p = new Person("fnametest", "lnametest", "emailtest");
//        String jsonStr = gson.toJson(p);
//        service.createPerson(jsonStr);
//    }
    
    @Test
    public void testAddedUser() {
        
        given().when().get("/api/person/complete/1")
            .then().statusCode(200);
    }
    @Test
    public void verifyAddedTestUser() {
        given().when().get("/api/person/complete").then()
            .body(containsString("fnametest"));
    }
    
}
