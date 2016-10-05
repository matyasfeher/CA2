package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Company;
import facade.GeoFacade;
import facade.TheFacade;
import java.util.List;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Acer
 */
@Path("company")
public class CompanyService {

    private static final String PU_NAME = "PU";

    static TheFacade facade = new TheFacade(Persistence.createEntityManagerFactory(PU_NAME));
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static GeoFacade geoFacade = new GeoFacade(Persistence.createEntityManagerFactory(PU_NAME));

    @Context
    private UriInfo context;

    public CompanyService() {
    }

    @GET
    @Path("complete")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllCompanies() {
        List companies = facade.getCompnaies();
        return gson.toJson(companies);
    }

    @GET
    @Path("complete/{cvr}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompany(@PathParam("cvr")int cvr){
        Company c = facade.getCompany(cvr);
        return gson.toJson(c);
    }
    
}
