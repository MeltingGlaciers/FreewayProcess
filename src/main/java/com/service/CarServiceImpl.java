package com.service;

import com.data.dao.CarRepository;
import com.data.dto.CarDTO;
import com.data.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository repository;

    @Override
    public Optional<Car> getById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(Car car) {
        repository.save(car);
    }

    @Override
    public void update(Integer id, Car car) {
        Car updated = repository.findById(id).orElse(null);
        if (updated!=null){
            updated.setInitSpeed(car.getInitSpeed());
            updated.setStatus(car.getStatus());
            repository.save(updated);
        }
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Integer addFromDTO(CarDTO dto){
        Car car = new Car();
        car.setStatus(dto.getStatus().getNumeredStatus());
        car.setInitSpeed(dto.getInitSpeed());
        repository.save(car);
        return car.getId();
    }

    @Override
    public List<Car> findAll() {
        return repository.findAll();
    }
}
