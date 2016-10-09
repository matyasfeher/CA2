
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Acer
 */
@Entity
public class CityInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="ZIP")
    private int ZIP;
    @Column(name="city")
    private String city;
    @OneToMany(mappedBy="Address",cascade=CascadeType.ALL)
    private List<Address> addressList;

    public CityInfo(int zipCode, String city) {
        this.ZIP = zipCode;
        this.city = city;
    }
    
    
    
    //Default Constructor
    public CityInfo(){
    
    }

    //Getters&Setter

    public int getZipCode() {
        return ZIP;
    }

    public void setZipCode(int zipCode) {
        this.ZIP = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getZIP() {
        return ZIP;
    }

    public void setZIP(int ZIP) {
        this.ZIP = ZIP;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
    
}
