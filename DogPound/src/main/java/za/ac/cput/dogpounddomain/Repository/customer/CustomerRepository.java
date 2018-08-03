package za.ac.cput.dogpounddomain.Repository.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.dogpounddomain.Domain.Customer;

@Repository
public interface CustomerRepository  extends CrudRepository<Customer, Long> {


}
