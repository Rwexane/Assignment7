package za.ac.cput.dogpounddomain.services.customer.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.dogpounddomain.Domain.Address;
import za.ac.cput.dogpounddomain.Repository.customer.AddressRepository;
import za.ac.cput.dogpounddomain.services.customer.AddressService;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository repository;

    @Override
    public Address findById(Long id) {
        return (Address) repository.findAll();
    }

    @Override
    public Address save(Address entity) {
        return repository.save(entity);
    }

    @Override
    public Address update(Address entity) {
        return repository.save(entity);

    }

    @Override
    public void delete(Address entity) {
        repository.delete(entity);
    }

     @Override
    public List<Address> findAll() {
        List<Address> addresss = new ArrayList<Address>();
        Iterable<Address> values = repository.findAll();

        for(Address value: values ){
            addresss.add(value);
        }
        return addresss;
    }

}