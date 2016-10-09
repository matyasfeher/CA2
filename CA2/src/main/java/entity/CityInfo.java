package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Acer
 */
@Entity
public class CityInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic(optional = false)
    @NotNull
    private int zipCode;
    private String city;

    public CityInfo(int zipCode, String city) {
        this.zipCode = zipCode;
        this.city = city;
    }

    //Default Constructor
    public CityInfo() {

    }

    //Getters&Setter
    public int getzipCode() {
        return zipCode;
    }

    public void setzipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


//    public List<Address> getAddressList() {
//        return addressList;
//    }
//
//    public void setAddressList(List<Address> addressList) {
//        this.addressList = addressList;
//    }
//    
}
