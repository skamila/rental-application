package skamila.rentalapplication.domain.hotel;

import javax.persistence.Embeddable;

@Embeddable
class Address {

    private final String street;
    private final String buildingNumber;
    private final String postalCode;
    private final String city;
    private final String country;

    Address(String street, String buildingNumber, String postalCode, String city, String country) {
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }
}
