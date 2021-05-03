package skamila.rentalapplication.domain.hotel;

public class HotelFactory {

    public Hotel create(String name, String street, String buildingNumber, String postalCode, String city, String country) {
        Address address = new Address(street, buildingNumber, postalCode, city, country);
        return new Hotel(name, address);
    }

}
