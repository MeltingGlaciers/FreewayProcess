package api.v1;

import data.dto.CarDTO;
import data.entity.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(
        path = "api/v1/cars"
)
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping(
            path = "all"
    )
    public List<CarDTO> read(){

        List<CarDTO> list = new ArrayList<>();
        carService.findAll().forEach((x) -> list.add(new CarDTO(x)));
        return list;
    }

    @PutMapping(
            path = "add"
    )
    public void add(@RequestBody CarDTO dto){

        carService.addFromDTO(dto);
    }

    @DeleteMapping(
            path = "delete/{id}"
    )
    public void delete(@PathVariable Integer id){

        carService.delete(id);

    }

}
