package com.api.v1;

import com.config.ApplicationConfig;
import com.data.CarStatus;
import com.data.dto.CarDTO;
import com.data.entity.Car;
import com.data.entity.Freeway;
import com.service.FreewayService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Controller
@RequestMapping(
        path = "api/v1/cars"
)
@AllArgsConstructor
public class CarController {

    private final CarService carService;
    private final FreewayService freewayService;
    private final ApplicationConfig applicationConfig;

    @GetMapping(
            path = "/all"
    )
    public List<CarDTO> read(){

        List<CarDTO> list = new ArrayList<>();
        carService.findAll().forEach((x) -> list.add(new CarDTO(x)));
        return list;
    }

    @PutMapping(
            path = "add/{freewayId}"
    )
    public void add(@PathVariable Integer freewayId){

        Optional<Freeway> freeway = freewayService.getById(freewayId);
        if(freeway.isPresent()) {
            CarDTO dto = new CarDTO(CarStatus.OK,
                    (int) (Math.random() * (
                            applicationConfig.getMaxInitSpeed() - applicationConfig.getMinInitSpeed()))
                            +applicationConfig.getMinInitSpeed());
            Integer carId = carService.addFromDTO(dto);
            freeway.get().getCars().add(carService.getById(carId).get());
        }
    }

    @DeleteMapping(
            path = "delete/{id}"
    )
    public void delete(@PathVariable Integer id){

        carService.delete(id);

    }

}
