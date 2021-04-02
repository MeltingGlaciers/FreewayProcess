package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car {
    private Integer id;

    private CarStatus status;

    private Integer initSpeed;

    public Car(int initSpeed){

        this.initSpeed = initSpeed;
        this.status = CarStatus.OK;
    }

}
