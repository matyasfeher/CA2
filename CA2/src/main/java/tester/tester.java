
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
        Person person = new Person("Zygi", "Pranka", "pr.zygimantas@gmail.com");
        Hobby hobby = new Hobby("Kiting", "Funfair");
        List<Phone> phoneList = new ArrayList();
        List<Hobby> hobbyList = new ArrayList();
        Phone phone = new Phone(50302505, "Mobile");
        Address address = new Address("New Manden", "South-West");
        phoneList.add(phone);
        hobbyList.add(hobby);
        person.setPhoneList(phoneList);
        person.setAddress(address);
        person.setHobbyList(hobbyList);
        EntityManager em = emf.createEntityManager();
        try{
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        }
        finally{
            em.close();
        }
    }
}
