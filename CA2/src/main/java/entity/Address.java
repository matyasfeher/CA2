package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Acer
 */
@Entity
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String additionalInfo;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private CityInfo cityInfo;
    @OneToMany(mappedBy = "address", fetch = FetchType.LAZY)
    private List<InfoEntity> infoEntities = new ArrayList();

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<InfoEntity> entity;
    public Address(String street, String additionalInfo) {
        this.street = street;
        this.additionalInfo = additionalInfo;
    }

    //Default Constructor
    public Address() {

    }

    //Getters&Setter
    public String getstreet() {
        return street;
    }

    public void setstreet(String street) {
        this.street = street;
    }

    public String getadditionalInfo() {
        return additionalInfo;
    }

    public void setadditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CityInfo getcityInfo() {
        return cityInfo;
    }

    public void setcityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public List<InfoEntity> getEntity() {
        return infoEntities;
    }

    public void setEntity(List<InfoEntity> entity) {
        this.infoEntities = entity;
    }

}
