//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package tester;
//
//import entity.Address;
//import entity.CityInfo;
//import entity.Company;
//import entity.Hobby;
//import entity.InfoEntity;
//import entity.Person;
//import entity.Phone;
//import java.util.ArrayList;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
///**
// *
// * @author Zygi
// */
//public class tester {
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//        Person person = new Person("I don't", "have", "a number");
//        List<Phone> phoneList = new ArrayList();
//        Phone phone = new Phone(50302505, "Mah phone");
//        Phone phone1 = new Phone(50302510, "Mah phone");
//        Phone phone2 = new Phone(50302520, "Mah phone");
//        phoneList.add(phone);
//        phoneList.add(phone1);
//        phoneList.add(phone2);
//        person.setPhoneList(phoneList);
//        EntityManager em = emf.createEntityManager();
//        try{
//        em.getTransaction().begin();
//        em.persist(person);
//        em.getTransaction().commit();
//        }
//        finally{
//            em.close();
//        }
//    }
//}
