///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package facade;
//
//import entity.Address;
//import entity.CityInfo;
//import entity.Company;
//import entity.Hobby;
//import entity.Person;
//import entity.Phone;
//import java.util.ArrayList;
//import java.util.List;
//import javax.persistence.EntityManager;
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
//
//    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_test");
//
//    private static facadeInterface instance = new TheFacade(emf);
//
//    public FacadeTest() {
//    }
//
//    @Before
//    public void setUp() {
//        EntityManager em = emf.createEntityManager();
//        List<Phone> phoneList = new ArrayList();
//        Phone phone = new Phone(50302505, "Mah phone");
//        Phone phone1 = new Phone(50302510, "Mah phone");
//        Phone phone2 = new Phone(50302520, "Mah phone");
//        Company c1 = new Company("aa", "bb", "Email@email.com", 123, 345, 6);
//        Person p1 = new Person("aa", "bb", "Email@email.com");
//        Person p2 = new Person("bb", "cc", "Email@email.com");
//        Hobby h1 = new Hobby("something", "something else");
//        Hobby h2 = new Hobby("blabla", "blabla");
//        CityInfo ci1 = new CityInfo(2800, "City");
//        CityInfo ci2 = new CityInfo(2700, "Other City");
//        Address a1 = new Address("Street", "Additional info");
//        Address a2 = new Address("Street 2", "Additional info");
//        phoneList.add(phone);
//        phoneList.add(phone1);
//        phoneList.add(phone2);
//        List<Address> addressList = new ArrayList();
//        addressList.add(a1);
//        addressList.add(a2);
////        ci1.setAddressList(addressList);
//        List<Person> pList = new ArrayList();
//        pList.add(p1);
//        pList.add(p2);
//        List<Hobby> hList = new ArrayList();
//        hList.add(h1);
//        hList.add(h2);
//        p1.setHobbyList(hList);
//        p2.setHobbyList(hList);
////        h1.setPersonList(pList);
////        h2.setPersonList(pList);
//        p1.setAddress(a2);
//        p2.setAddress(a1);
//        c1.setAddress(a2);
//        p1.setPhoneList(phoneList);
//
//        try {
//            em.getTransaction().begin();
//
//
//            em.persist(p1);
//            em.persist(p2);
//            em.persist(c1);
//
//            em.getTransaction().commit();
//        } finally {
//            em.close();
//        }
//
//    }
//
//    /**
//     * Test of getPerson method, of class TheFacade.
//     */
//    @Test
//    public void testGetPerson() {
//        System.out.println("getPerson");
//
//        String result = instance.getPerson(0).getFirstName();
//        assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPersons method, of class TheFacade.
//     */
//    @Test
//    public void testGetPersons() {
//        List<Person> result = instance.getPersons();
//        assertEquals(2, result.size());
//    }
//
//    /**
//     * Test of getPersons method, of class TheFacade.
//     */
//    @Test
//    public void testGetPersons_int() {
//        System.out.println("getPersons");
//        int zipCode = 2800;
//
//        List<Person> result = instance.getPersons(zipCode);
//        assertEquals(2, result.size());
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCompany method, of class TheFacade.
//     */
//    @Test
//    public void testGetCompany() {
//        System.out.println("getCompany");
//        int cvr = 123;
//
//        Company result = instance.getCompany(cvr);
//        assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCompnaies method, of class TheFacade.
//     */
//    @Test
//    public void testGetCompnaies() {
//        System.out.println("getCompnaies");
//
//        List<Company> result = instance.getCompnaies();
//        assertEquals(1, result.size());
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addPerson method, of class TheFacade.
//     */
//    @Test
//    public void testAddPerson() {
//        System.out.println("addPerson");
//        String fname = "";
//        String lname = "";
//        String email = "";
//        Person a = new Person(fname, lname, email);
//
//        instance.addPerson(a);
//        assertEquals(instance.getPerson(2), a);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addComapny method, of class TheFacade.
//     */
//    @Test
//    public void testAddComapny() {
//        System.out.println("addComapny");
//        String name = "";
//        String description = "";
//        int cvr = 0;
//        int numEmployees = 0;
//        int marketValue = 0;
//        Company c = new Company(name, description, "Email@email.com", cvr, numEmployees, marketValue);
//        instance.addComapny(c);
//        assertEquals(c, instance.getCompany(0));
//
//        /* instance.addCompany(name, description, cvr, numEmployees, marketValue);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//         */
//    }
//
//}
