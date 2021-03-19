package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class FreewayProcess {

    List<Car> cars;
    Freeway freeway;
    List<CrushRegistrar> crushRegistrars;

    public FreewayProcess(Freeway freeway){

        this.freeway = freeway;
        cars = new LinkedList<>();
        crushRegistrars = new ArrayList<>();
    }

    public void addCar(Car car){

        cars.add(car);
    }
}
