package skamila.rentalapplication.infrastructure.rest.api.hotelroom;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import skamila.rentalapplication.application.hotelroom.HotelRoomApplicationService;

@RequestMapping("/hotelroom")
public class HotelRoomRestController {

    private final HotelRoomApplicationService hotelRoomApplicationService;

    public HotelRoomRestController(HotelRoomApplicationService hotelRoomApplicationService) {
        this.hotelRoomApplicationService = hotelRoomApplicationService;
    }

    @PostMapping
    public void add(@RequestBody HotelRoomDto hotelRoomDto) {
        hotelRoomApplicationService.add(hotelRoomDto.getHotelId(), hotelRoomDto.getNumber(),
                hotelRoomDto.getSpacesDefinition(), hotelRoomDto.getDescription());
    }
}
