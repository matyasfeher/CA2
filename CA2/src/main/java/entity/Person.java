package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Acer
 */
@Entity
        
public class Person extends InfoEntity {
    private static final long serialVersionUID = 1L;

    
    private String firstName;
    private String lastName;
    @ManyToMany
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
    
    
    

    
}
