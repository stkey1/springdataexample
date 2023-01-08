package service;

import entity.Address;
import org.springframework.stereotype.Service;
import repository.AddressRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class AddressService {
    private final AddressRepository addressRepository;


    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void addAddress(){
        Address address=new Address();
        address.setStreet("Bakirkoy");
        address.setZipCode(34303);
        addressRepository.save(address);
    }
    public void deleteAddress(long id) {
    Optional<Address> deleteId = addressRepository.findById(id);
    addressRepository.delete(deleteId.orElse(new Address()));
    }

    public void findAddress(Long id) {
        addressRepository.findById(id);

    }

    public void findByStreetOrZipCode(String street, int zipCode){
    Set<Address> addresses = addressRepository.findByStreetOrZipCode(street, zipCode);
    }
}