package service;


import data.dto.CarDTO;
import data.entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    Optional<Car> getById(Integer id);
    void save(Car car);
    void update(Integer id, Car car);
    void delete(Integer id);
    void addFromDTO(CarDTO dto);
    List<Car> findAll();

}
