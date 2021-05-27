package service;

import data.dao.CarRepository;
import data.dto.CarDTO;
import data.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
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
    public void addFromDTO(CarDTO dto){
        Car car = new Car();
        car.setStatus(dto.getStatus().getNumeredStatus());
        car.setInitSpeed(dto.getInitSpeed());
        repository.save(car);
    }

    @Override
    public List<Car> findAll() {
        return repository.findAll();
    }
}
