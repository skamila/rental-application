package skamila.rentalapplication.domain.apartment;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApartmentFactory {

    public Apartment create(String ownerId, String street, String postalCode, String houseNumber, String apartmentNumber,
                             String city, String country, String description, Map<String, Double> roomsDefinition) {
        Address address = new Address(street, postalCode, houseNumber, apartmentNumber, city, country);
        List<Room> rooms = roomsDefinition.entrySet()
                .stream()
                .map(entry -> new Room(entry.getKey(), new SquareMeter(entry.getValue())))
                .collect(Collectors.toList());
        return new Apartment(ownerId, address, description, rooms);
    }
}
