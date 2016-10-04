package facade;

import entity.Company;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Acer
 */
public class TheFacade implements facadeInterface {
    EntityManagerFactory emf;

    public TheFacade(EntityManagerFactory emf) {
        this.emf=emf;
    }
    
    private EntityManager getEntityManager() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em;
    }
    
    @Override
    public Person getPerson(int id) {
        EntityManager em = getEntityManager();
        Person p = em.find(Person.class, id);
        return p;
    }
    
    @Override
    public List<Person> getPersons() {
        List<Person> people;
        EntityManager em = getEntityManager();
        String query = "SELECT p FROM Person p";
        Query q = em.createNamedQuery(query);
        people = q.getResultList();
        return people;
    }
    
    @Override
    public List<Person> getPersons(int zipCode) {
        List<Person> people;
        String query = "SELECT p FROM Person p WHERE p.zipCode = :"+zipCode;
        EntityManager em = getEntityManager();
        Query q = em.createQuery(query);
        people = q.getResultList(); 
        return people;
    }
    
    @Override
    public Company getCompany(int cvr) {
        Company company;
        String query = "SELECT c FROM Company c WHERE c.cvr = :"+cvr;
        EntityManager em = getEntityManager();
        Query q = em.createQuery(query);
        company = (Company) q.getSingleResult();
        return company;
    
    }
    
    @Override
    public List<Company> getCompnaies() {
    List<Company> companies;
        EntityManager em = getEntityManager();
        String query = "SELECT c FROM Company c";
        Query q = em.createQuery(query);
        companies = q.getResultList();
        return companies;
    }
    
    @Override
    public void addPerson(String fname, String lname) {
        EntityManager em = getEntityManager();
        Person p = new Person(fname, lname);
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    @Override
    public void addComapny(String name, String description, int cvr, int numEmployees, int marketValue) {
        EntityManager em = getEntityManager();
        Company c = new Company(name, description, cvr, numEmployees, marketValue);
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    @Override
    public void removePerson(int id) {
        EntityManager em = getEntityManager();
        Person p = em.find(Person.class, id);
        em.remove(p);
    }
    
    @Override
    public void removeCompany(int cvr) {
        EntityManager em = getEntityManager();
        String query = "SELECT c FROM Company c WHERE c.cvr = :"+cvr;
        Query q = em.createQuery(query);
        Company company;
        company = (Company)q.getSingleResult();
        em.remove(company);
    }

    
    
}
