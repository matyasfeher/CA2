package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import entity.Person;
import facade.GeoFacade;
import facade.TheFacade;
import facade.facadeInterface;
import java.util.List;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Lenovo
 */
@Path("person")
public class PersonService {
    private static final String PU_NAME = "PU";
    
    static TheFacade facade = new TheFacade(Persistence.createEntityManagerFactory(PU_NAME));
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static GeoFacade geoFacade = new GeoFacade(Persistence.createEntityManagerFactory(PU_NAME));
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EntityService
     */
    public PersonService() {
    }

    @GET
    @Path("complete")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersons() {
        List list = facade.getPersons();
        return gson.toJson(list);
    }
    
    @GET
    @Path("complete/{id}")
    public String getPerson(@PathParam("id") int id){
        Person p = facade.getPerson(id);
        return gson.toJson(p);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createPerson(String jsonPerson){
        Person person = gson.fromJson(jsonPerson, Person.class);
        facade.addPerson(person);
        String jsonResult = gson.toJson(person);
        return jsonResult;
        
    }    
    
}
