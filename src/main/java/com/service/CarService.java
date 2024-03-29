package com.service;


import com.data.dto.CarDTO;
import com.data.entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    Optional<Car> getById(Integer id);
    void save(Car car);
    void update(Integer id, Car car);
    void delete(Integer id);
    Integer addFromDTO(CarDTO dto);
    List<Car> findAll();

}
