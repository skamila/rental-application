package skamila.rentalapplication.infrastructure.persistence.jpa.hotel;

import skamila.rentalapplication.domain.hotel.Hotel;
import skamila.rentalapplication.domain.hotel.HotelRepository;

public class JpaHotelRepository implements HotelRepository {

    private final SpringJpaHotelRepository springJpaHotelRepository;

    public JpaHotelRepository(SpringJpaHotelRepository springJpaHotelRepository) {
        this.springJpaHotelRepository = springJpaHotelRepository;
    }

    public void save(Hotel hotel) {
        springJpaHotelRepository.save(hotel);
    }
}
