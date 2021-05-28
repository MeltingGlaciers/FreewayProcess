package com.data.dto;


import com.data.entity.Car;
import com.data.entity.Crush;
import com.data.entity.Freeway;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FreewayDTO {

    private Integer length;

    private List<CarDTO> cars;

    private List<CrushDTO> crushes;

    public FreewayDTO(Freeway freeway, List<Car> cars, List<Crush> crushes){

        length = freeway.getLength();
        cars.forEach(
                x -> this.cars.add(new CarDTO(x))
        );
        crushes.forEach(
                x -> this.crushes.add(new CrushDTO(x,x.getCrushMembers()))
        );

    }

}
