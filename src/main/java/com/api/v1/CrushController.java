package com.api.v1;

import com.data.dto.CarDTO;
import com.data.dto.CrushDTO;
import com.data.entity.Car;
import com.data.entity.Crush;
import com.data.entity.Freeway;
import com.service.FreewayService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.service.CarService;
import com.service.CrushService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(
        path = "api/v1/crushes"
)
@AllArgsConstructor
public class CrushController {

    private final CrushService crushService;
    private final CarService carService;
    private final FreewayService freewayService;

    @GetMapping
    @RequestMapping(
            path="/all"
    )
    public List<CrushDTO> read(){

        List<CrushDTO> list = new ArrayList<>();
        crushService.findAll().forEach(
                (x) -> list.add(new CrushDTO(x,x.getCrushMembers()))
        );
        return list;
    }

    @PutMapping
    @RequestMapping(
            path = "/add/{freewayId}"
    )
    public void add(@PathVariable Integer freewayId, @RequestBody CrushDTO dto){

        Optional<Freeway> freeway = freewayService.getById(freewayId);

        if(freeway.isPresent()) {
            Integer crushId = crushService.addFromDTO(dto);
            freeway.get().getCars().add(carService.getById(crushId).get());
        }

    }

    @PutMapping
    @RequestMapping(
            path = "/{id}/add_member/{carId}"
    )
    public void addMember(@PathVariable Integer id,@PathVariable Integer carId, @RequestBody CarDTO dto){

        Optional<Crush> crushOpt = crushService.getById(id);
        Optional<Car> carOpt = carService.getById(carId);
        if(carOpt.isPresent() && crushOpt.isPresent()) {
            Crush crush = crushOpt.get();
            crush.getCrushMembers().add(carOpt.get());
            crushService.save(crush);
        }
    }

    @DeleteMapping
    @RequestMapping(
            path = "/delete/{id}"
    )
    public void delete(@PathVariable Integer id){

        crushService.delete(id);

    }




}
