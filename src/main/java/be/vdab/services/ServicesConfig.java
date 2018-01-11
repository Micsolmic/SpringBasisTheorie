package be.vdab.services;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:services.xml")
@Configuration
@ComponentScan
public class ServicesConfig {
}
