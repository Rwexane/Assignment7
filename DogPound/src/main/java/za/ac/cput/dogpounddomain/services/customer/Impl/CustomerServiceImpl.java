package za.ac.cput.customerpounddomain.services.customer.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.dogpounddomain.Domain.Customer;
import za.ac.cput.dogpounddomain.Repository.customer.CustomerRepository;
import za.ac.cput.dogpounddomain.services.customer.CustomerService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer findById(Long id) {
        return (Customer) repository.findAll();
    }

    @Override
    public Customer save(Customer entity) {
        return repository.save(entity);
    }

    @Override
    public Customer update(Customer entity) {
        return repository.save(entity);

    }

    @Override
    public void delete(Customer entity) {
        repository.delete(entity);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();
        Iterable<Customer> values = repository.findAll();

        for(Customer value: values ){
            customers.add(value);
        }
        return customers;
    }

}