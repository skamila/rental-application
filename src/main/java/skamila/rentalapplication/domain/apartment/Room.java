package skamila.rentalapplication.domain.apartment;

class Room {

    private final String name;
    private final SquareMeter size;

    Room(String name, SquareMeter size) {
        this.name = name;
        this.size = size;
    }
}
