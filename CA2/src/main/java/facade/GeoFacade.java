package facade;

import entity.Address;
import entity.CityInfo;
import entity.Phone;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Acer
 */
public class GeoFacade implements geoInterface {

    EntityManagerFactory emf;

    public GeoFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManager getEntityManager() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em;
    }

    @Override
    public void addPhone(int phone, String description) {
        EntityManager em = getEntityManager();
        Phone p = new Phone(phone, description);
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
    public void addAddress(String street, String additionalInfo) {
        EntityManager em = getEntityManager();
        Address a = new Address(street, additionalInfo);
        try {
            em.getTransaction().begin();
            em.persist(a);
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
    public void addCityInfo(int zipcode, String city) {
        EntityManager em = getEntityManager();
        CityInfo ci = new CityInfo(zipcode, city);
        try {
            em.getTransaction().begin();
            em.persist(ci);
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
    public void removePhone(int phoneNumber) {
        EntityManager em = getEntityManager();
        String query = "SELECT p FROM Phone p WHERE p.number = :" + phoneNumber;
        Query q = em.createQuery(query);
        Phone p = (Phone)q.getSingleResult();
        em.remove(p);
    }

    @Override
    public void removeAddress(String street) {
        EntityManager em = getEntityManager();
        String query = "SELECT a FROM Address a WHERE a.street = :" + street;
        Query q = em.createQuery(query);
        Address a = (Address)q.getSingleResult();
        em.remove(a);
    }

    @Override
    public void removeCityInfo(int zipCode) {
        EntityManager em = getEntityManager();
        String query = "SELECT c FROM CityInfo c WHERE c.zip = :" + zipCode;
        Query q = em.createQuery(query);
        CityInfo ci = (CityInfo)q.getSingleResult();
        em.remove(ci);
    
    }

    @Override
    public Phone getPhone(int id) {
        EntityManager em = getEntityManager();
        Phone p = em.find(Phone.class, id);
        return p;
    }

    @Override
    public Address getAddress(int id) {
        EntityManager em = getEntityManager();
        Address a = em.find(Address.class, id);
        return a;
    }

    @Override
    public CityInfo getCityInfo(int id) {
        EntityManager em = getEntityManager();
        CityInfo ci = em.find(CityInfo.class, id);
        return ci;
    }

    @Override
    public List<Phone> getAllPhone() {
        String query = "SELECT p FROM Phone p";
        List<Phone> phoneList;
        EntityManager em = getEntityManager();
        Query q = em.createQuery(query);
        phoneList = q.getResultList();
        return phoneList;
    }
    @Override
    public List<Address> getAllAddress() {
        String query = "SELECT a FROM Address a";
        List<Address> addressList;
        EntityManager em = getEntityManager();
        Query q = em.createQuery(query);
        addressList = q.getResultList();
        return addressList;
    }
    @Override
    public List<CityInfo> getAllCityInfo() {
        String query = "SELECT c FROM CityInfo c";
        List<CityInfo> cityInfoList;
        EntityManager em = getEntityManager();
        Query q = em.createQuery(query);
        cityInfoList = q.getResultList();
        return cityInfoList;
    }
}
