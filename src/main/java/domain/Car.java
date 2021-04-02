package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car {

    private CarStatus status;

    private int initSpeed;

    public Car(int initSpeed){

        this.initSpeed = initSpeed;
        this.status = CarStatus.OK;
    }

}
