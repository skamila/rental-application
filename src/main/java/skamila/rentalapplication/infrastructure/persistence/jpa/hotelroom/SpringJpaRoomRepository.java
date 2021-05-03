package skamila.rentalapplication.infrastructure.persistence.jpa.hotelroom;

import org.springframework.data.repository.CrudRepository;
import skamila.rentalapplication.domain.hotelroom.HotelRoom;

public interface SpringJpaRoomRepository extends CrudRepository<HotelRoom, String> {
}
