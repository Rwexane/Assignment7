package za.ac.cput.dogpounddomain.Repository.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.dogpounddomain.Domain.Dog;

@Repository
public interface DogRepository  extends CrudRepository<Dog, Long> {
}
