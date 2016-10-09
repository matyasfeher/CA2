package entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "person")

public class Person extends InfoEntity {

    private static final long serialVersionUID = 1L;

//    @Column(name="firstname")
    private String firstName;
//    @Column(name="lastname")
    private String lastName;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private List<Hobby> hobbies = new ArrayList();

    public Person(String firstName, String lastName, String email) {
        super(email);
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Person() {

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

    public List<Hobby> gethobbies() {
        return hobbies;
    }

    public void sethobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

}
