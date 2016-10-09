package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
//    @Column(name = "id")
    private Integer id;
//    @Column(name = "street")
    private String Street;
//    @Column(name = "addinfo")
    private String AdditionalInfo;


    @ManyToOne
    private CityInfo cInfo;
    
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<InfoEntity> entity;

    public Address(String Street, String AdditionalInfo) {
        this.Street = Street;
        this.AdditionalInfo = AdditionalInfo;
    }

    //Default Constructor
    public Address() {

    }

    //Getters&Setter
    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getAdditionalInfo() {
        return AdditionalInfo;
    }

    public void setAdditionalInfo(String AdditionalInfo) {
        this.AdditionalInfo = AdditionalInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CityInfo getcInfo() {
        return cInfo;
    }

    public void setcInfo(CityInfo cInfo) {
        this.cInfo = cInfo;
    }

//    public List<InfoEntity> getEntity() {
//        return entity;
//    }
//
//    public void setEntity(List<InfoEntity> entity) {
//        this.entity = entity;
//    }
    
}

