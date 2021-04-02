package service;

import config.ApplicationConfig;
import domain.CrushRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.CarRepository;
import repository.CrushRegistrarRepository;
import repository.FreewayRepository;

@Component
public class FreewayService {

    private CarRepository carRepository;
    @Autowired
    public void setCarRepository(CarRepository carRepository) { this.carRepository = carRepository;}

    private CrushRegistrarRepository crushRegistrarRepository;
    @Autowired
    public void setCarRepository(CrushRegistrarRepository crushRegistrarRepository) {
        this.crushRegistrarRepository = crushRegistrarRepository;
    }

    private FreewayRepository freewayRepository;
    @Autowired
    public void setFreewayRepository(FreewayRepository freewayRepository) {this.freewayRepository = freewayRepository;}

    private ApplicationConfig applicationConfig;
    @Autowired
    public void setApplicationConfig(ApplicationConfig applicationConfig) { this.applicationConfig = applicationConfig;}

}
