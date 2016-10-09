package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Acer
 */
@Entity
public class Phone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="number")
    private int number;
    @Column(name="Description")
    private String description;
    @ManyToOne(cascade=CascadeType.ALL)
     @JoinTable(name="PHONE_INFOENTITY", 
  joinColumns=@JoinColumn(name="PHONE_ID"),
  inverseJoinColumns=@JoinColumn(name="INFOENTITY_ID"))
    private InfoEntity infoentity;

    public Phone(int number, String description) {
        this.number = number;
        this.description = description;
    }
    
    
    
    //Default Constructor
    public Phone(){
    
    }    
    //Getters&Setter

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }    
}
