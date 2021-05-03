package skamila.rentalapplication.domain.apartment;

public class Room {

    private final String name;
    private final SquareMeter size;

    public Room(String name, SquareMeter size) {
        this.name = name;
        this.size = size;
    }
}
