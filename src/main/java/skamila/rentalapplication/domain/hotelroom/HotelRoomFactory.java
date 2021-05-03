package skamila.rentalapplication.domain.hotelroom;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelRoomFactory {

    public HotelRoom create(String hotelId, int number, Map<String, Double> spacesDefinition, String description) {
        List<Space> spaces = spacesDefinition
                .entrySet()
                .stream()
                .map(entry -> new Space(entry.getKey(), new SquareMeter(entry.getValue())))
                .collect(Collectors.toList());
        return new HotelRoom(hotelId, number, description, spaces);
    }

}
