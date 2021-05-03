package skamila.rentalapplication.infrastructure.persistence.jpa.hotel;

import org.springframework.data.repository.CrudRepository;
import skamila.rentalapplication.domain.hotel.Hotel;

public interface SpringJpaHotelRepository extends CrudRepository<Hotel, String> {
}
