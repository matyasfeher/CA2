/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Address;
import entity.CityInfo;
import entity.Company;
import entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class FacadeTest {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_test");
    
      private static facadeInterface instance = new TheFacade(emf);
    
    public FacadeTest() {
    }
    
    @Before
    public void setUp() {
        EntityManager em = emf.createEntityManager();
        CityInfo ci1 = new CityInfo(2800,"City");
            CityInfo ci2 = new CityInfo(2700,"Other City");
            Address a1 = new Address("Street","Additional info");
            Address a2 = new Address ("Street 2","Additional info");
              List<Address> addressList = new ArrayList();
              addressList.add(a1);
              addressList.add(a2);
            ci1.setAddressList(addressList);
            Person p1 = new Person("aa","bb","Email@email.com");
            Person p2 = new Person("bb","cc","Email@email.com");
        try{
            em.getTransaction().begin();
                     
            
           
            em.persist(p1);
            em.persist(p2);
            em.getTransaction().commit();
        }
        finally{
            em.close();
        }
        
    }

    /**
     * Test of getPerson method, of class TheFacade.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        
        
        String expResult = "aa";
        String result = instance.getPerson(0).getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersons method, of class TheFacade.
     */
    @Test
    public void testGetPersons() {
        List<Person> result = instance.getPersons();
        assertEquals(2,result.size());
    }

    /**
     * Test of getPersons method, of class TheFacade.
     */
    @Test
    public void testGetPersons_int() {
        System.out.println("getPersons");
        int zipCode = 0;
       
        List<Person> expResult = null;
        List<Person> result = instance.getPersons(zipCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class TheFacade.
     */
    @Test
    public void testGetCompany() {
        System.out.println("getCompany");
        int cvr = 0;
        
        Company expResult = null;
        Company result = instance.getCompany(cvr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompnaies method, of class TheFacade.
     */
    @Test
    public void testGetCompnaies() {
        System.out.println("getCompnaies");
        
        List<Company> expResult = null;
        List<Company> result = instance.getCompnaies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerson method, of class TheFacade.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        String fname = "";
        String lname = "";
        String email = "";
        Person a = new Person(fname,lname,email);
        
        instance.addPerson(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addComapny method, of class TheFacade.
     */
    @Test
    public void testAddComapny() {
        System.out.println("addComapny");
        String name = "";
        String description = "";
        int cvr = 0;
        int numEmployees = 0;
        int marketValue = 0;
        
       /* instance.addCompany(name, description, cvr, numEmployees, marketValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    */}

    /**
     * Test of removePerson method, of class TheFacade.
     */
    @Test
    public void testRemovePerson() {
        System.out.println("removePerson");
        int id = 0;
        
        instance.removePerson(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCompany method, of class TheFacade.
     */
    @Test
    public void testRemoveCompany() {
        System.out.println("removeCompany");
        int cvr = 0;
        
        instance.removeCompany(cvr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
