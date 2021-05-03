package skamila.rentalapplication.application.hotel;

import skamila.rentalapplication.domain.hotel.Hotel;
import skamila.rentalapplication.domain.hotel.HotelFactory;

public class HotelApplicationService {

    public void add(String name, String street, String buildingNumber, String postalCode, String city, String country) {
        Hotel hotel = new HotelFactory().create(name, street, buildingNumber, postalCode, city, country);
    }

}
