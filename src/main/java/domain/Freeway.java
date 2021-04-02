package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Freeway {

    private Integer id;

    private Integer length;

    List<Car> cars;
    List<CrushRegistrar> crushRegistrars;

    public Freeway(int length){

        this.length = length;
        cars = new LinkedList<>();
        crushRegistrars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
