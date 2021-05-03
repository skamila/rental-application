package skamila.rentalapplication.domain.apartment;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
class Room {

    private final String name;

    @Embedded
    private final SquareMeter size;

    Room(String name, SquareMeter size) {
        this.name = name;
        this.size = size;
    }
}
