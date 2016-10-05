package facade;

import entity.Address;
import entity.CityInfo;
import entity.Phone;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface geoInterface {
    void addPhone(int phone, String description);
    void addAddress(String street, String additionalInfo);
    void addCityInfo(int zipcode, String city);
    
    void removePhone(int phoneNumber);
    void removeAddress(String street);
    void removeCityInfo(int zipCode);
    
    Phone getPhone(int id);
    Address getAddress(int id);
    CityInfo getCityInfo(int id);
    
    List<Phone> getAllPhone();
    List<Address> getAllAddress();
    List<CityInfo> getAllCityInfo();
    
    
}
