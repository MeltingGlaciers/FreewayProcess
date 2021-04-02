package config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {


    @Value("${minInitSpeed}")
    private int minInitSpeed;

    @Value("${maxInitSpeed}")
    private int maxInitSpeed;

    @Value("${artificialShortTermDelayChance}")
    private double artificialShortTermDelayChance;

    @Value("${minArtificialShortTermDelayTime}")
    private int minArtificialShortTermDelayTime;

    @Value("${maxArtificialShortTermDelayTime}")
    private int maxArtificialShortTermDelayTime;



}
