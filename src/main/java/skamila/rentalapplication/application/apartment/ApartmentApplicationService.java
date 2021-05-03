package skamila.rentalapplication.application.apartment;

import skamila.rentalapplication.domain.apartment.Apartment;
import skamila.rentalapplication.domain.apartment.ApartmentFactory;

import java.util.Map;

public class ApartmentApplicationService {

    public void add(String ownerId, String street, String postalCode, String houseNumber, String apartmentNumber,
                    String city, String country, String description, Map<String, Double> roomsDefinition) {
        Apartment apartment = new ApartmentFactory().create(ownerId, street, postalCode, houseNumber, apartmentNumber, city, country, description, roomsDefinition);
    }

}
