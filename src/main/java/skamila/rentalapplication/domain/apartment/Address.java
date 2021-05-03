package skamila.rentalapplication.domain.apartment;

class Address {

    private final String street;
    private final String postalCode;
    private final String houseNumber;
    private final String apartmentNumber;
    private final String city;
    private final String country;

    Address(String street, String postalCode, String houseNumber, String apartmentNumber, String city, String country) {
        this.street = street;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.country = country;
    }

}
