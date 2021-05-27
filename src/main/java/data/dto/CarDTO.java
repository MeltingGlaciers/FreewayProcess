package data.dto;

import data.CarStatus;
import data.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CarDTO {

    private CarStatus status;

    private Integer initSpeed;

    public CarDTO(Car car){

        status = CarStatus.getStatusFromNum(car.getStatus());
        initSpeed = car.getInitSpeed();

    }

}
