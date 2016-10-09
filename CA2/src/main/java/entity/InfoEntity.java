package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Acer
 */
@Entity
//@Table(name="InfoEntity")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Type")
public class InfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Integer id;
    private String email; 
    @JoinColumn(name = "Info_Entity_ID")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Phone> phoneList;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Info_Entity_ID")
    private Address address;

    public InfoEntity(String email) {
        this.email = email;

    }

    //Default Constructor
    public InfoEntity() {

    }

    //Getters&Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
