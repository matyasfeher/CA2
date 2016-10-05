package tester;

import facade.TheFacade;
import javax.persistence.Persistence;

/**
 *
 * @author Acer
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persistence.generateSchema("PU", null);
        TheFacade facade = new TheFacade(Persistence.createEntityManagerFactory("PU"));
        
        facade.addPerson("Matyas", "Feher", "fehermatyas@gmail.com");
        facade.addPerson("Mark", "Herczegfalvy", "herczegfalvy@gmail.com");
        facade.addPerson("Balint", "Gergely", "gergely.balint@gmail.com");
    }
    
}
