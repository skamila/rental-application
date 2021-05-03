package skamila.rentalapplication.infrastructure.rest.api.hotel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import skamila.rentalapplication.application.hotel.HotelApplicationService;

@RestController("/hotel")
public class HotelRestController {

    private final HotelApplicationService hotelApplicationService;

    public HotelRestController(HotelApplicationService hotelApplicationService) {
        this.hotelApplicationService = hotelApplicationService;
    }

    @PostMapping
    public void add(@RequestBody HotelDto hotelDto) {
        hotelApplicationService.add(hotelDto.getName(), hotelDto.getStreet(), hotelDto.getBuildingNumber(),
                hotelDto.getPostalCode(), hotelDto.getCity(), hotelDto.getCountry());
    }
}
