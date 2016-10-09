package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Acer
 */
@Entity
@Table(name="person")

        
public class Person extends InfoEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
     
    @ManyToMany()
    @JoinTable(name="PERSON_HOBBY", 
  joinColumns=@JoinColumn(name="PERSON_ID"),
  inverseJoinColumns=@JoinColumn(name="HOBBY_ID"))
    private List<Hobby> hobbyList;

    public Person(String firstName, String lastName, String email) {
        super(email);
        this.firstName = firstName;
        this.lastName = lastName; 
        
    }
    
    
    
    public Person(){
    
    }

    //Getters&Setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Hobby> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<Hobby> hobbyList) {
        this.hobbyList = hobbyList;
    }
    
    
    

    
}
