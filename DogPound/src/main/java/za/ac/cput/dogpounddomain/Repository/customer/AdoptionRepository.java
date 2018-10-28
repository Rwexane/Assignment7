package za.ac.cput.dogpounddomain.Repository.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.dogpounddomain.Domain.Adoption;

@Repository
public interface AdoptionRepository extends CrudRepository<Adoption, Long> {
    Adoption findOne(Long id);
}
