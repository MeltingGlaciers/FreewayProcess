package com.api.v1;

import com.data.dto.FreewayDTO;
import com.data.entity.Freeway;
import com.service.FreewayService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(
        path = "/freeways"
)
public class FreewayController {

    private final FreewayService freewayService;

    @GetMapping
    @RequestMapping(
            path = "/all"
    )
    public List<FreewayDTO> read(){

        List<FreewayDTO> list = new ArrayList<>();
        freewayService.findAll().forEach(
                x -> list.add(new FreewayDTO(x,x.getCars(),x.getCrushes()))
        );
        return list;

    }

    @PutMapping
    @RequestMapping(
            path = "/add"
    )
    public void add(@RequestBody Integer length){

        freewayService.addFromDto(length);
    }

}
