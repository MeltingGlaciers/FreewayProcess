package com.data.dto;

import com.data.entity.Car;
import com.data.entity.Crush;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CrushDTO {

    private Date date;

    private Integer crushPos;

    private List<CarDTO> cars;

    public CrushDTO(Crush crush, List<Car> cars){

        date = crush.getDate();
        crushPos = crush.getCrushPosition();
        cars.forEach(
                (x) -> this.cars.add(new CarDTO(x))
        );

    }

}
