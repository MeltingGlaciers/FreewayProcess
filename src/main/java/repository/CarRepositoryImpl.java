package repository;

import domain.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryImpl implements CarRepository {
    public final List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> cars() {
        return new ArrayList<>(cars);
    }

    @Override
    public Car getById(Integer id) {
        return cars.stream()
                .filter(r -> r.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    @Override
    public void add(Car car){

    }


}
