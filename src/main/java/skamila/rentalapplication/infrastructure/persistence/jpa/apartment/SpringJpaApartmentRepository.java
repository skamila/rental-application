package skamila.rentalapplication.infrastructure.persistence.jpa.apartment;

import org.springframework.data.repository.CrudRepository;
import skamila.rentalapplication.domain.apartment.Apartment;


public interface SpringJpaApartmentRepository extends CrudRepository<Apartment, String> {
}
