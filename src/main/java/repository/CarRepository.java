package repository;

import domain.Car;

import java.util.List;

public interface CarRepository {
    List<Car> cars();

    Car getById(Integer id);

    void add(Car car);


}
