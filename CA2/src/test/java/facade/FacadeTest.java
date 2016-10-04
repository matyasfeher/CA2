///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package facade;
//
//import entity.Company;
//import entity.Person;
//import java.util.List;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Lenovo
// */
//public class FacadeTest {
//    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_test");
//    
//      private static facadeInterface instance = new TheFacade(emf);
//    
//    public FacadeTest() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//
//    /**
//     * Test of getPerson method, of class Facade.
//     */
//    @Test
//    public void testGetPerson() {
//        System.out.println("getPerson");
//        int id = 0;
//        
//        Person expResult = null;
//        Person result = instance.getPerson(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPersons method, of class Facade.
//     */
//    @Test
//    public void testGetPersons_0args() {
//        System.out.println("getPersons");
//        
//        List<Person> expResult = null;
//        List<Person> result = instance.getPersons();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPersons method, of class Facade.
//     */
//    @Test
//    public void testGetPersons_int() {
//        System.out.println("getPersons");
//        int zipCode = 0;
//       
//        List<Person> expResult = null;
//        List<Person> result = instance.getPersons(zipCode);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCompany method, of class Facade.
//     */
//    @Test
//    public void testGetCompany() {
//        System.out.println("getCompany");
//        int cvr = 0;
//        
//        Company expResult = null;
//        Company result = instance.getCompany(cvr);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCompnaies method, of class Facade.
//     */
//    @Test
//    public void testGetCompnaies() {
//        System.out.println("getCompnaies");
//        
//        List<Company> expResult = null;
//        List<Company> result = instance.getCompnaies();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addPerson method, of class Facade.
//     */
//    @Test
//    public void testAddPerson() {
//        System.out.println("addPerson");
//        String fname = "";
//        String lname = "";
//        
//        instance.addPerson(fname, lname);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addComapny method, of class Facade.
//     */
//    @Test
//    public void testAddComapny() {
//        System.out.println("addComapny");
//        String name = "";
//        String description = "";
//        int cvr = 0;
//        int numEmployees = 0;
//        int marketValue = 0;
//        
//        instance.addComapny(name, description, cvr, numEmployees, marketValue);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removePerson method, of class Facade.
//     */
//    @Test
//    public void testRemovePerson() {
//        System.out.println("removePerson");
//        int id = 0;
//        
//        instance.removePerson(id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeCompany method, of class Facade.
//     */
//    @Test
//    public void testRemoveCompany() {
//        System.out.println("removeCompany");
//        int cvr = 0;
//        
//        instance.removeCompany(cvr);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
