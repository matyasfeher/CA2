package facade;

import entity.Company;
import entity.Person;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface facadeInterface {

    Person getPerson(int id);

    List<Person> getPersons();

    List<Person> getPersons(int zipCode);

    Company getCompany(int cvr);

    List<Company> getCompnaies();

    void addPerson(String fname, String lname, String email);

    void addComapny(String name, String description, String email, int cvr, int numEmployees, int marketValue);

    void removePerson(int id);

    void removeCompany(int cvr);
}
