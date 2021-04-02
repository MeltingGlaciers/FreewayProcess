package config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {


    @Value("${minInitSpeed}")
    private Integer minInitSpeed;

    @Value("${maxInitSpeed}")
    private Integer maxInitSpeed;

    @Value("${artificialShortTermDelayChance}")
    private Double artificialShortTermDelayChance;

    @Value("${minArtificialShortTermDelayTime}")
    private Integer minArtificialShortTermDelayTime;

    @Value("${maxArtificialShortTermDelayTime}")
    private Integer maxArtificialShortTermDelayTime;



}
