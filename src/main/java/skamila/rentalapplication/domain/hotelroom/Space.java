package skamila.rentalapplication.domain.hotelroom;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
class Space {

    private final String name;

    @Embedded
    private final SquareMeter size;

    Space(String name, SquareMeter size) {
        this.name = name;
        this.size = size;
    }
}
