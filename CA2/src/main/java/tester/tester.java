
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
        
        Person person1 = new Person("Zygimantas", "Pranka", "pr.zygimantas@gmail.com");
        Person person2 = new Person("Tomas", "Jablonskis", "tomas@gmail.com");
        Person person3 = new Person("Juozas", "Kernagis", "juozas@gmail.com");
        Person person4 = new Person("Kastytis", "Simonas", "kastytis@gmail.com");
        Person person5 = new Person("Laurynas", "Kazilionis", "laurynas@gmail.com");
        
        Address address1 = new Address("Jamers st.", "Flat");
        Address address2 = new Address("Alberts st.", "House");
        Address address3 = new Address("Stains st.", "Flat");
        Address address4 = new Address("Alborg st.", "Flat");
        Address address5 = new Address("Franksan st.", "Flat");
        
        person1.setAddress(address1);
        person2.setAddress(address2);
        person3.setAddress(address3);
        person4.setAddress(address4);
        person5.setAddress(address5);
        
        Hobby hobby1 = new Hobby("Basketball", "Sports");   
        Hobby hobby2 = new Hobby("Football", "Sports");
        Hobby hobby3 = new Hobby("Chess", "Sports");
        Hobby hobby4 = new Hobby("VolleyBall", "Sports");
        Hobby hobby5 = new Hobby("Hockey", "Sports");
        
        List<Hobby> list1 = new ArrayList();
        List<Hobby> list2 = new ArrayList();
        List<Hobby> list3 = new ArrayList();
        List<Hobby> list4 = new ArrayList();
        
        list1.add(hobby1);
        list1.add(hobby2);
        list2.add(hobby2);
        list2.add(hobby3);
        list3.add(hobby3);
        list3.add(hobby4);
        list4.add(hobby4);
        list4.add(hobby5);
        
        
        person1.sethobbies(list1);
        person2.sethobbies(list3);
        person3.sethobbies(list4);
        person4.sethobbies(list2);
        person5.sethobbies(list1);
        
        Phone phone1 = new Phone(55555555, "Mobile phone");
        Phone phone2 = new Phone(56555555, "House phone");
        Phone phone3 = new Phone(55755555, "Mobile phone");
        Phone phone4 = new Phone(55585555, "House phone");
        Phone phone5 = new Phone(55559555, "Mobile phone");
        
        List<Phone> ph1 = new ArrayList();
        List<Phone> ph2 = new ArrayList();
        List<Phone> ph3 = new ArrayList();
        List<Phone> ph4 = new ArrayList();
        List<Phone> ph5 = new ArrayList();
        
        ph1.add(phone1);
        ph2.add(phone2);
        ph3.add(phone3);
        ph4.add(phone4);
        ph5.add(phone5);
        
        person1.setPhoneList(ph1);
        person2.setPhoneList(ph2);
        person3.setPhoneList(ph3);
        person4.setPhoneList(ph4);
        person5.setPhoneList(ph5);
        
        
        


        try {
          em.getTransaction().begin();
          em.persist(person1);
          em.persist(person2);
          em.persist(person3);
          em.persist(person4);
          em.persist(person5);
          em.getTransaction().commit();
            
        } finally {
            em.close();
        }
    }
}