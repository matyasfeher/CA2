
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
        Address adress = new Address("Random Street.", "It's an amazing place to not live in");
        CityInfo city = new CityInfo(2300, "Copenhagen");
        Company company = new Company("Balabazorus", "Poop","asdasdasd@asdasda.com", 10089538, 100, 10);
        Hobby hobby = new Hobby("Gaming", "Just click buttons on my PC");
        InfoEntity infoentity = new InfoEntity("imcool@gmail.com");
        Person person = new Person("Zygi", "Pranka", "gdgsdgf@fdgfd.com");
        Phone phone = new Phone(50324565, "My Phone");
        EntityManager em = emf.createEntityManager();
        try{
        em.getTransaction().begin();
        em.persist(adress);
        em.persist(city);
        em.persist(company);
        em.persist(hobby);
        em.persist(infoentity);
        em.persist(person);
        em.persist(phone);
        em.getTransaction().commit();
        }
        finally{
            em.close();
        }
    }
}
