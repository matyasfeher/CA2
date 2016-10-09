
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import entity.Address;
import entity.CityInfo;
import entity.Company;
import entity.Hobby;
import entity.InfoEntity;
import entity.Person;
import entity.Phone;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Zygi
 */
public class tester {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        List<Phone> phoneList = new ArrayList();
        Phone phone = new Phone(50302505, "Mah phone");
        Phone phone1 = new Phone(50302510, "Mah phone");
        Phone phone2 = new Phone(50302520, "Mah phone");
        Company c1 = new Company("aa", "bb", "Email@email.com", 123, 345, 6);
        Person p1 = new Person("aa", "bb", "Email@email.com");
        Person p2 = new Person("bb", "cc", "Email@email.com");
        Hobby h1 = new Hobby("something", "something else");
        Hobby h2 = new Hobby("blabla", "blabla");
        CityInfo ci1 = new CityInfo(2800, "City");
        CityInfo ci2 = new CityInfo(2700, "Other City");
        Address a1 = new Address("Street", "Additional info");
        Address a2 = new Address("Street 2", "Additional info");
        phoneList.add(phone);
        phoneList.add(phone1);
        phoneList.add(phone2);
//        List<Address> addressList = new ArrayList();
//        addressList.add(a1);
//        addressList.add(a2);
//        ci1.setAddressList(addressList);
//        List<Person> pList = new ArrayList();
//        pList.add(p1);
//        pList.add(p2);
        List<Hobby> hList = new ArrayList();
        hList.add(h1);
        hList.add(h2);
        p1.setHobbyList(hList);
        p2.setHobbyList(hList);
//        h1.setPersonList(pList);
//        h2.setPersonList(pList);
        p1.setAddress(a2);
        p2.setAddress(a1);
        c1.setAddress(a2);
        p1.setPhoneList(phoneList);

        try {
            em.getTransaction().begin();

            em.persist(p1);
            em.persist(p2);
            em.persist(ci1);
            em.persist(ci2);
            em.persist(c1);

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}