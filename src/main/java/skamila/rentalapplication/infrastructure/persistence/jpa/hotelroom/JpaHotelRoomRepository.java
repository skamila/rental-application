package skamila.rentalapplication.infrastructure.persistence.jpa.hotelroom;

import skamila.rentalapplication.domain.hotelroom.HotelRoom;
import skamila.rentalapplication.domain.hotelroom.HotelRoomRepository;

public class JpaHotelRoomRepository implements HotelRoomRepository {

    private final SpringJpaRoomRepository springJpaRoomRepository;

    public JpaHotelRoomRepository(SpringJpaRoomRepository springJpaRoomRepository) {
        this.springJpaRoomRepository = springJpaRoomRepository;
    }

    public void save(HotelRoom hotelRoom) {
        springJpaRoomRepository.save(hotelRoom);
    }

}
