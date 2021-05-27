package config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {


    @Value("${init.speed.min}")
    private Integer minInitSpeed;

    @Value("${init.speed.max}")
    private Integer maxInitSpeed;

    @Value("${artificial.short_term_delay.probability}")
    private Double artificialShortTermDelayChance;

    @Value("${artificial.short_term_delay.time.min}")
    private Integer minArtificialShortTermDelayTime;

    @Value("${artificial.short_term_delay.time.max}")
    private Integer maxArtificialShortTermDelayTime;



}
